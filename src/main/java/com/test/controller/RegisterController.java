package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.RegisterDTO;

@Controller
@RequestMapping("/day03/")
public class RegisterController {
	
	@GetMapping("reg")
	public void register() {
		System.out.println("register 페이지 접속");
	}
	
	@GetMapping("dto")
	public void dto(RegisterDTO dto, HttpServletRequest request, Model model) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getName());
		System.out.println(dto.getSex()[0]);
		System.out.println(dto.getEmail());
		System.out.println(dto.getPhone());
		
		
		model.addAttribute("id" , dto.getId());
		model.addAttribute("pw", dto.getPw());
		model.addAttribute("name" , dto.getName());
		model.addAttribute( "sex", dto.getSex()[0]);
		model.addAttribute("email" , dto.getEmail());
		model.addAttribute("phone" , dto.getPhone());
		
		
		
//		request.setAttribute("id" , dto.getId());
//		request.setAttribute("pw", dto.getPw());
//		request.setAttribute("name" , dto.getName());
//		request.setAttribute( "sex", dto.getSex()[0]);
//		request.setAttribute("email" , dto.getEmail());
//		request.setAttribute("phone" , dto.getPhone());
		
		
		
	}

}
