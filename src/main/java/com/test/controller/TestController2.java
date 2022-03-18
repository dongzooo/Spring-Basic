package com.test.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.TestDTO;

@Controller
//@RequestMapping("/day03/")
public class TestController2 {
	
	@GetMapping("test01")
	public void test01(String a) {
		System.out.println("/day03/test01 호출!");
		System.out.println(a);
	}
	
	
	@GetMapping("form")
	public void form ()
	{
		System.out.println("form 요청");
	}
	
	//http://localhost:8080/day03/pro?id=11&pw=22
	@GetMapping("pro")
	//#1. 매개변수 나열해서 하나씩 따로 받기
//	public void pro(String id, String pw)
	//#2 DTO안에 자동으로 바인딩해서 받기 : 이때 DTO에는 setter 존재해야함
	
	public void pro(TestDTO dto,HttpServletRequest request, HttpServletResponse response,HttpSession session){ //set메서드가 있어야 바인디잉 된다
		System.out.println("pro 요청!");
		System.out.println("request : " + request);
		System.out.println("request : " + request.getRequestURI());
		 
		
//		System.out.println(id);
//		System.out.println(pw);
		System.out.println(dto);
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
	}
	
	//...8080/day03/ex01?name=abc&age10
	// @@RequestParam("파라미터명") : 요청할 때 넘어온 파라미터를 명시적으로 매개변수 앞에 붙혀서 
									//해당 파라미터는 이 매개변수에 담아야된다고 알려주는 것
									//어노테이션을 붙히면 매개변수 이름은 파라미터 이름과 달라도 괜찮다.
	
	@GetMapping("ex01")
	public void ex01(@RequestParam("name") String name,
			@RequestParam int age){
		System.out.println("ex01 요청");
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}
	
	//파라미터 ArrayList에 담기
	// ?arr=a?arr-b?arr=c
	@GetMapping("ex02")
//	public void ex02(@RequestParam("arr") ArrayList<String> arr) { //배열에는 @RequestParam 없어도 된다.
	public void ex02(String[] arr) { //배열에는 @RequestParam 없어도 된다.
		System.out.println("ex02 요청");
		System.out.println(arr);
		for(String s : arr) {
			System.out.println(s);
		}
	}
	
	//뷰에 데이터 보내기
	@GetMapping("ex03")
	public void ex03(HttpServletRequest request, Model model) {
		System.out.println("ex03 요청!!");
		//model 객체에 속성을 추가
		model.addAttribute("name", "터미네이터");
		model.addAttribute("name2", "T1000");
		
		
		
		//
//		request.setAttribute("name", "피카츄");
//		request.setAttribute("name2", "꼬북이");
		
		
		
	}
}
