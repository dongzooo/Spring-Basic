package com.test.persistence;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.mapper.TimeMapper;
import com.test.model.TestDTO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {
	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	
//	@Test
//	public void testGetAllId() {
//		log.info("***********************************");
//		List<String> result = timeMapper.getAllId();
//		log.info(result);
//		log.info("***********************************");
//		
//	}
	
//	@Test
//	public void testGetMember() {
//		TestDTO dto = timeMapper.getMember("JAVA01");
//		log.info(dto);
//	}
	
//	@Test
//	public void TestInsertMember() {
//		TestDTO dto = new TestDTO();
//		dto.setId("spring03");
//		dto.setPw("1111");
//		dto.setAge(10);
//		int result = timeMapper.insertMember(dto);
//		log.info("result***************"+result);
//	}
	
//	@Test
//	public void setPw() {
//		TestDTO dto = new TestDTO();
//		dto.setId("spring01");
//		dto.setPw("2222");
//		timeMapper.setPw(dto);
//	}
	
	@Test
	public void testDeleteMember() {
		timeMapper.deleteMember("JAVA11");
	}
	
//	@Test
//	public void testGetTime() {
//		log.info(TimeMapper.getClass().getName());
//		log.info(TimeMapper.getTime());
//		
//	}
//	
//	@Test
//	public void testGetTime2() {
//		log.info("----------------------------------------------------------------------");
//		log.info(TimeMapper.getTime2());
//		log.info("----------------------------------------------------------------------");
//		
//	}
	

}
