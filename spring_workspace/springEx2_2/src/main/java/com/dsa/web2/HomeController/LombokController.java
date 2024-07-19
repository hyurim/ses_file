package com.dsa.web2.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dsa.web2.vo.Person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("lombok")
// lombok이 들어오는 것은 받아주겠다. 라는 식으로 되어 있음
public class LombokController {
	
	/*
	 * lombok
	 * 자바 어플리케이션 개발에서 @Annotation을 활용하여 코드를 줄여주고
	 * 가독성을 높여주는 라이브러리
	 * @Getter, @Setter, @ToString, @EqualsAndHashCode
	 * @NoArgsConstructor : 매개변수가 없는 기본 생성자를 생성
	 * @AllArgsConstructor : 모든 필드를 매개변수로 받는 생성자를 생성
	 * @RequiredArgsConstrucotr : final 또는 @NonNull 필드를 
	 * 매개변수로 받는 생성자를 생성
	 * @Data
	 * @Getter, @Setter, ToString, @EqualsAndHashCode를 한 번에 생성
	 * @Builder
	 * 
	 */
	@GetMapping("lombok1")
	public String lombok1() {
		// 인스턴스 생성 후 setter를 이용한 초기화
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(99);
		p.setPhone("01012341234");
		
		// builder를 이용한 초기화
		Person p2 = Person.builder()
					.name("이순신")
					.age(80)
					.phone("01012345678")
					.build();
		
		log.debug("Person객체: {}", p);
		log.debug("Person객체: {}", p2);
		return "lombok/lombok1";
	}
	
	@GetMapping("lombok2")
	public String lombok2() {
		log.error("error level");
		log.warn("warn level");
		log.info("info level");
		log.debug("debug level");
		log.trace("trave level");
		// 요청을 다시 보냄
		return "redirect:/";
	}
}
