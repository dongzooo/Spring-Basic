package com.test.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RegisterDTO {
	private String id ;
	private String pw ;
	private String name ;
	private String[] sex;
	private String email ;
	private String phone ;
	

}
