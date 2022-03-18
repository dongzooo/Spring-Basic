package com.test.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component // 스필링이 관리할 객체이다~<context : component-scan : 스프링에서 자동주입 관리해줌
@Data	//Restaurant의 getter/setter
public class Restaurant {
	
	/*
	 * @Setter : 자동으로 setChef()를 컴파일 시 생성함.
	 * onMethod_ : 생성되는 setChef()에 @Autowired 어노테이션을 추가
	 * 				setChef(Chef) 메서드에 매개변수로 있는 Chef를 자동으로 주입해줘~~
	 * */
	
	//방법1. @Autowired 
	//방법2. @Setter(onMethod_=@Autowired)
	//방법3. xml에서 <bean>으로 이클래스 생성할 때, <property> 태그로 set메서드 호출하여 채워주는 형태로 작성
	
	//@Autowired //new 필요없이 자동주입됌
	@Setter(onMethod_=@Autowired)
	private Chef chef;
	
		
	// Restaurant rt = new Restaurant(); 
	//rt.setChef(스프링이 객체생성해둔 Chef 객체를 자동으로 매개변수 값으로 채우기)
	

}
