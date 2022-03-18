package com.test.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

/*
 * @RunWith: 현재 테스트 코드가 스프링을 실행하는 역할을 할 것이라는 것을 표시함
 * @Contextconfiguration : 지정된 클래스나, 문자열을 이용해 필요한 객체들을
 * 스프링내에 객체로 등록하게 해줌
 * ()안에 문자열은 'classpath : '나 file : 을 할 수 있다.
 * @Log4j : 로그 관련 사용하겠다.
 * */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class SampleTests {

	@Autowired
	private Restaurant restaruant;
	
	//Chef, Restaurant 빈이 생성 잘되었는지 체크
	@Test 
	public void testExist() {
		assertNotNull(restaruant); //null이 아니면 테스트 성공으로 체크해주는 메서드
		
		System.out.println(restaruant);
		System.out.println(restaruant.getChef());
	}

}
