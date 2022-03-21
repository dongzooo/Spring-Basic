package com.test.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.TestDTO;
import com.test.model.TestTV;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/day04/")
public class TestController3 {
	
	@GetMapping("test01")
	public void test01(Model model , HttpServletRequest request, HttpSession session){
		System.out.println("test01 호출");
		//model: Hashmap의 맵의 구조로 생김, key, value 형태로 속성 추가가능
		// addAtribute(String key, Object value);
		model.addAttribute("name", "고니");
		model.addAttribute("age", 20);
		
//		request.setAttribute("name", "정마담");
//		request.setAttribute("age", "100");
		
		session.setAttribute("name", "아귀");
		session.setAttribute("age", 50);
		
		model.addAttribute("arr", new int[] {1,2,3,4,5});
		
		
	}
	
	@GetMapping("test02")
	public void test02(Model model) {
		System.out.println("test02 호출");
		model.addAttribute("dto", new TestDTO());
		model.addAttribute("arr", new int[] {1,2,3,4,5});
		
	}
	
	@GetMapping("test03")
	public void test03(Model model) {
		System.out.println("test03 호출");
		model.addAttribute("day", new Date());
		model.addAttribute("arr", new int[] {10,20,30,40,50});
		
		List list = new ArrayList();
		for (int i = 0 ; i < 5 ; i++) {
			list.add(1+i);
		}
		model.addAttribute("list", list);
		
		TestDTO dto = new TestDTO();
		dto.setId("vlzk");
		dto.setPw("1234"); 
		model.addAttribute("dto", dto);
	}
	
	//http://localhost:8080/day04/test03?id=java&pw=1111
	//요청한 데이터를 그냥 넘겨줄거면 @ModelAttribute
	// 변형해서 데이터를 보낼거면  Model model
	@GetMapping("test04")
	public void test04(@ModelAttribute("dto") TestDTO dto,
			@ModelAttribute("id") String id,
			@ModelAttribute("pw") int pw, Model model) {
		model.addAttribute("newid", id+ "Hello");
	}
	
	
	//메서드별 어노테이션 부착 : test01~04 모든 view엥서 tv객체사용가능
	//해당 클래스에 있는 요청 메서드 호출전에 먼저 아래메서드가 호출되서
	// 뷰에 TV 객체 전달 -> 이 클래스에 모든 jsp 에서 필요한 객체가  있으면
	//아래와 같이 작성해주기

	@ModelAttribute("tv")
	public TestTV getTV(String color) {
		System.out.println("getTv호출");
		TestTV tv = new TestTV();
		tv.setPower(true);
		tv.setCh(10);
		tv.setVol(5);
		tv.setColor(color);
		return tv;
	}
	
//	@GetMapping("test05")
//	public String test05(Model model) {
//		model.addAttribute("hello", "hahaha");
//		return "day04/test05"; //jsp파일 경로 리턴
//	}
	
	//요즘은 잘안쓰는 방식
//	@GetMapping("test05")
//	public ModelAndView test05() {
//		//객체생성
//		ModelAndView mv = new ModelAndView();
//		
//		//뷰에 전달할 데이터 추가
//		mv.addObject("Hello", "hahaha");
//		
//		//뷰 경로 저장
//		mv.setViewName("day04/test05");
//		
//		return mv;
//	}
	
	//스프링에서 기본적으로 forward 방식으로 이동
//	@GetMapping("test05")
//	public String test05() {
//		System.out.println("test05 호출");
//		return "redirect:/day04/testNewpage";
//	}
	
	@PostMapping("test05")
	public void test05() {
		System.out.println("test05 호출!");
	}
	
	
	@GetMapping("testNewpage")
	public void testNewpage() {
		System.out.println("testNewpage 호출!!");
	}
	
}
