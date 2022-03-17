package com.test.sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@ComponentScan
@Service
@Repository
public class Chef {
	private String name;

}
