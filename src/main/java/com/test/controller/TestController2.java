package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/day02/")
public class TestController2 {
	
	@GetMapping("re1")
	public String re1() {
		System.out.println("컨트롤러 2 요청");
		return "day02/test";
	}
	
//	@GetMapping("hello2")
//	public void re2() {
//		System.out.println("void 성공");
//		
//	}

}
