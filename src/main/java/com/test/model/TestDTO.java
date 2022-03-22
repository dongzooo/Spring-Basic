package com.test.model;

import java.sql.Timestamp;

import com.test.mapper.TimeMapper;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TestDTO {
	private String id;
	private String pw;
	private Integer age;
	private Timestamp reg;
}
