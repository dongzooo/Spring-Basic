package com.test.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component // 스프링이 관리할 객체다
@ToString  // toString 자동 생성
@Getter	// get메서드 자동생성 (클래스에 붙이면 모든 변수에 적용 )
//@Setter
@AllArgsConstructor //모든 인스턴스 변수를 매개변수로 갖는 생성자 자동생성
@RequiredArgsConstructor //원하는 변수들을 매개변수로 갖는 생성자 생성
						//@Nonnull이나 final이 붙은 변수에 대해서만 생성자에 매개변수로 포함.
//클래스위에 선언하면 다 적용, 변수위에만 적용하면 거기에만
public class SampleHotel {
	
//	@NonNull
	@Setter //set메서드 자동생성 (변수에 각각 붙히면 해당 변수에만 적용)
	private Chef chef;
	
	public SampleHotel(Chef chef) {
		this.chef = chef;
	}
	
	private int num;
	
//	private final int num;
	
}
