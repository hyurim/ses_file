package com.dsa.web2.HomeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocalController {

//	@RequestMapping 을 쓰지 않으면 local/~~을 다 써야한다.
	@GetMapping("local/save")
	public String save() {
		return "local/save";
	}
	
	@GetMapping("local/read")
	public String read() {
		return "local/read";
	}
	
	@GetMapping("local/delete")
	public String delete() {
		return "local/delete";
	}
}
