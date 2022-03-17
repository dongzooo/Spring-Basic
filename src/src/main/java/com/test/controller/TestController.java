package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/day02/")
public class TestController {

	//#1 리턴타입 : String : return "jsp 파일 이름"
	@GetMapping("hello")
	public String hello() {
		System.out.println("test/hello 요청됌");
		return "day02/test";
	}
	
	//#2 리턴타입 : void : 요청경로 ==jsp 파일 경로
	@GetMapping("hello2")
	public void hello2() {
		System.out.println("hello2 요청!");
	}
	
	
	
}
