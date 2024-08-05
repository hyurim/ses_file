package com.dsa.web4.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dsa.web4.dto.GuestBookDTO;
import com.dsa.web4.service.GuestService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
@RequestMapping("guest")
@RequiredArgsConstructor
public class GuestController {
	
	private final GuestService gs;
	
	@GetMapping("write")
	public String writeForm() {
		return "writeForm";
	}
	

	@PostMapping("write")
	public String writeForm(
	        @RequestParam(name = "id") String id,
	        @RequestParam(name = "pw") String pw,
	        @RequestParam(name = "message") String message,
	        HttpSession session
	        ) {
	    log.debug("ID: {}", id);
	    log.debug("Password: {}", pw);
	    log.debug("Message: {}", message);
	    
	    gs.insertData(id, pw, message);
	    return "guestList";
	}
	
	
	@GetMapping("guestlist")
	public String guest(Model model) {
		List<GuestBookDTO> guest = gs.selectAllData();
		
		model.addAttribute("guest", guest);
		
		return "guestList";
	}
	
	@PostMapping("guestlist")
	public String guest(@RequestParam("num") String num) {
		gs.deleteData(num);
		return "redirect:/guest/guestlist";
	}
}
