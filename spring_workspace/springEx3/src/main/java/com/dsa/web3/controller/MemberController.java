package com.dsa.web3.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dsa.web3.dto.MemberDTO;
import com.dsa.web3.entity.MemberEntity;
import com.dsa.web3.repository.MemberRepository;
import com.dsa.web3.service.MemberService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService ms;
	
	/*
	 * 회원가입 폼으로 이동
	 * @return joinForm.html로 이동
	 * */
	@GetMapping("join")
	public String join() {
		return "member/joinForm";
	}
	
	/**
	 * 로그인 폼으로 이동
	 * @return loginform.html
	 */
	@GetMapping("login")
	public String login() {
		// templates 패키지로부터 html을 찾는다.
		return "member/loginForm";
	}
	/**
	 * 로그인 처리
	 * @param id
	 * @param pw
	 * @param HttpSeesion 객체
	 * @return loginForm.html
	 */
	@PostMapping("login")
	public String login(
			@RequestParam(name = "id") String id,
			@RequestParam(name = "pw") String pw,
			HttpSession session
			) {
		
		// id 값을 파라미터로 DB에 회원정보가 존재하는지를 판별
		MemberDTO member = ms.selectData(id);
        log.debug("{}",member);
		
		if(member != null) {
			// 만약 입력정보가 DB에 존재한다면 패스워드가 일치하는지 판별
			if(member.getPw().equals(pw)) {
				// 일치한 정보일 경우 session 객체에 저장
				session.setAttribute("loginId", member.getId());
				String currentId = (String) session.getAttribute("loginId");
				log.debug("현재 로그인한 ID: {}", currentId);
				return "redirect:/";
			}
			else {
				// 비밀번호가 일치하지 않을 경우
				log.debug("로그인 비밀번호가 일치하지 않습니다.");
				return "member/loginForm";
			}
		} else {
			log.debug("로그인 실패! DB에 저장된 회원정보가 없음");
			return "member/loginForm";
		}
	}
	
	/**
	 * 로그아웃 처리
	 * @param HttpSession
	 * @return home.html
	 */
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("loginId");
		String sessionId = (String) session.getAttribute("loginId");
		log.debug("로그아웃, 현재 세션정보: {}", sessionId);
        
		return "redirect:/";
	}
	
	/**
	 * 회원정보 수정
	 * 
	 */
	@GetMapping("update")
	public String update(HttpSession session, Model model) {
		String sessionId = (String) session.getAttribute("loginId");
		log.debug("현재 세션정보: {}", sessionId);
		MemberDTO member = ms.selectData(sessionId);
        log.debug("{}",member);
        
        model.addAttribute("member", member);
        
		return "member/updateForm";
	}
	@PostMapping("update")
	public String update(MemberDTO member) {
		ms.updateData(member);
		
		return "redirect:/";
	}
//	@PostMapping("update")
//	public String update(
//			@RequestParam(name = "id") String id,
//			@RequestParam(name = "pw") String pw,
//			@RequestParam(name = "name") String name,
//			@RequestParam(name = "phone") String phone,
//			@RequestParam(name = "address") String address
//			) {
//		MemberDTO member = new MemberDTO();
//        member.setId(id);
//        member.setPw(pw);
//        member.setName(name);
//        member.setPhone(phone);
//        member.setAddress(address);
//
//        log.debug("업데이트 된 정보 : {}",member);
//        ms.updateData(member);
//		
//		return "redirect:/";
//	}
	/**
	 * 회원정보 수정폼으로 이동
	 * @param HttpSession
	 * @return updataForm.html
	 */
	@GetMapping("update1")
	public String update1(HttpSession session, Model model) {
		// 로그인한 유저의 id를 세션객체로부터 불러오기
		String id = (String) session.getAttribute("loginId");
		// id값에 일치하는 DB 회원정보를 자바객체로 가져오기
		MemberDTO member = ms.selectData(id);
		// HTML에 출력하기 위해서 model 객체에 해당 객체를 저장
		model.addAttribute("member", member);
		
		
		return "member/updateForm1";
	}
	
	/**
	 * 회원정보 수정 처리
	 * @param memberDTO
	 * @return home.html
	 */
	@PostMapping("update1")
	public String update1(@ModelAttribute MemberDTO member) {
		ms.updateData(member);
		
		return "redirect:/";
	}
//	@GetMapping("update")
//	public String update(HttpSession session, Model model) {
//		String sessionId = (String) session.getAttribute("loginId");
//		log.debug("현재 세션정보: {}", sessionId);
//		MemberDTO member = ms.selectData(sessionId);
//        log.debug("{}",member);
//        
//        model.addAttribute("member", member);
//        
//		return "member/updateForm";
//	}
	/**
	 * 회원정보 조회
	 * @return selectForm.html
	 */
	@GetMapping("select")
	public String selectForm() {
	    return "member/selectForm";
	}
	
	/**
	 * 회원 아이디가 일치하는지 안하는지 여부 확인 후 출력
	 * @param id
	 * @param model
	 * @return selectResult.html
	 */
	@PostMapping("select")
	public String select(
			@RequestParam("id") String id, Model model) {
	    // DB에서 ID로 회원 정보를 가져오기
	    MemberDTO member = ms.selectData(id);
	    if (member == null) {	   
	    	model.addAttribute("id", id);
	    	return "member/selectResult"; 
	    }
    	// 모델에 회원 정보 추가
	    model.addAttribute("member", member);
    	return "member/selectResult";
	}

	
	/**
	 * url로부터 들어온 요청을 처리하는 메서드
	 * http://localhost:9993/web3/member/info/"abc"형식으로 요청
	 * @param id
	 * @param model
	 * @return select.html
	 */
	@GetMapping("info" + "/{id}")
	public String info(
			// 요청 URL의 일부를 메서드 파라미터로 매핑
			@PathVariable(name = "id") String id,
			Model model
			) {
		
		MemberDTO member = ms.selectData(id);
		
		model.addAttribute("searchId", id);
		model.addAttribute("member", member);
		
		return "member/selectResult";
	}
	
	/**
	 * 전체 목록 조회
	 * @param model
	 * @return list.html
	 */
	@GetMapping("list")
	public String list(Model model) {
		List<MemberDTO> member = ms.selectAllData();
		
		model.addAttribute("member", member);
		
		return "member/list";
	}
	/**
	 * 전체 목록 중에서 데이터 삭제
	 * @param id
	 * @return list.html
	 */
	@PostMapping("list")
	public String list(@RequestParam("id") String id) {
		ms.deleteData(id);
		return "redirect:/member/list";
	}
	/**
	 * 회원 정보 삭제 처리
	 * @param id
	 * @return list.html
	 */
    @GetMapping("delete")
    public String delete(@RequestParam("id") String id) {
        ms.deleteData(id);
        return "redirect:/member/list";
    }
}