package com.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 컨트롤러 역할을 할 클래스다~ 선언
@Controller
@RequestMapping("/sample/") //클래스 레벨에 경로 추가, 이클래스 안에ㅔ 메서들의 경로 전에 모두  /sample/ 경로가 추가됌
public class SampleController {
	// @RequestMapping에 주소만 작성하면 get방식, post 방식 모두 받아준다.
		
	//요청되는 "" 마다 메서드를 실행해준다.
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello page 요청됌!!");
		
		//hello요청에 해당하는 비즈니스로직 처리할 객체의 메서드 호출 (로직처리 해라~)
		
		return "day02/test"; //jsp페이지 파일명:web-inf/views를 제외한 디렉토리 작성
	}
		
	//GET 방식의 요청만 받겠다 value="요청주소", method = 요청방식
	
	
	/*
	 * CRUD
	 * Create POST
	 * Read		GET
	 * Update   PUT
	 * Delete   DELETE
	 * */
	
	@RequestMapping("test")
	public String test() {
		System.out.println("test page 요청됌");
		
		return "day02/test";
	}
	
	
	@GetMapping("test2") // GET 요청만 받는 어노테이션
	public String test2() {
		
		return "day02/test";
	}
	
	@PostMapping({"test3"}) // POST 요청만 받는 어노 테이션
	public String test3(){
		return "day02/test";
		
	}
	
	//여러 경로를 한번에 적용
	@GetMapping({"test4", "test5"})
	public String test4() {
		System.out.println("test page4 요청됌");
		return "day02/test";
	}
	
//	@GetMapping("sample?") //물음표에 아무거나 와도 같은 페이지가 실행된다.
//	public String test6() {
//		return "day02/test";
//		
//	}
	
}
