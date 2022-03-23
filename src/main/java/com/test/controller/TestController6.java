package com.test.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.mapper.TestMapper;
import com.test.model.TestDTO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/day06/")
@Log4j
public class TestController6 {
	
	@Setter(onMethod_ = @Autowired )
	private TestMapper testMapper; 
	
	//form 화면 요청
	@GetMapping("form")
	public void form() {
		System.out.println("form 요청");
		
	}
	
	//form에서 넘어온 데이터 처리 요청
	@PostMapping("pro")
	public void pro(TestDTO dto) {
		System.out.println("pro 요청!!");
		
		//DB저장
		testMapper.insertMember(dto);
		
//		System.out.println(dto.getId());
//		System.out.println(dto.getPw());
//		System.out.println(dto.getAge());
	}
	
	@GetMapping("test")
	public void test() {
		//메서드 설명은 xml파일에 있음
		
//		System.out.println("test 요청");
//		int count = testMapper.memberCount();
//		System.out.println("count : "+count);
		
		
//		int maxage = testMapper.maxAge();
//		System.out.println("maxage : "+maxage);
		
		
//		List<TestDTO> list = testMapper.selectAll();
//		System.out.println(list);
//		list.forEach(dto -> System.out.println(dto));
		
		
//		TestDTO dto =testMapper.selectOne("spring01");
//		System.out.println(dto);
		
		
//		Timestamp reg= testMapper.getReg("spring02");
//		System.out.println(reg);
		
//		testMapper.updateMember("spring01", "5555", 50);
		
		
		//동적쿼리
//		int count = testMapper.selectIf();
//		System.out.println(count);
		
//		TestDTO dto = new TestDTO();
//		dto.setId("spring01");
//		//id pw 같은지 확인
//		dto.setPw("5555");
//		int count = testMapper.selectTrim(dto);
//		System.out.println(count);
//		
//		if(count > 0) {
//			System.out.println(dto.getId() + "는 이미 사용중인 id입니다.");
//		}else {
//			System.out.println(dto.getId() + "는 사용가능합니다");
//		}
//		
		
//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
//		List<TestDTO> resultList = testMapper.selectIn(list);
//		System.out.println(resultList);
//		resultList.forEach(dto ->System.out.println(dto));
		
		//sellectKey
//		TestDTO dto= new TestDTO();
//		dto.setId("spring09");
//		dto.setPw("1111");
//	
//		testMapper.insertSk(dto);
//		System.out.println(dto);
		
		//ID에 s라는 문자가 포함된 정보 모두 추출
//		TestDTO dto= new TestDTO();
//		List<TestDTO> list =  testMapper.selectLike("s");
//		System.out.println(list);
		
		//컬럼명(검색기준)과 키워드 두개를 보내서 일치하는 것 찾기
//		HashMap map = new HashMap();
//		map.put("column", "pw"); //select 박스로 사용하자가 선택한 검색기준
//		map.put("keyword", "0"); // 검색 키워드 작성한 것
//		List<TestDTO> list = testMapper.selectLike(map);
//		list.forEach(dto -> System.out.println(dto));
		
	}
	
	
	//localhos/8080/pro?id=java&pw=1234&age=10
//	@RequestMapping(value = "pro", params = {"id=java", "pw"}) //유효성 검사 파라미터 제약 id 파라미터는 반그시 java 값으로 와야 요청 성공
//	@RequestMapping(value = "pro", params = {"id=java", "pw" , "!age"})//id=java이고 pw는 들어와야하고 age는 있으면 안된다
	//public String pro(@RequestParam(value = "id", defaultValue = "hello") String id , // 디폴트로 들어와있음
//	@RequestMapping("pro")	
//	public String pro(@RequestParam(value = "id", required = true) String id ,
//			@RequestParam(value = "pw") String pw) {
//		
//		System.out.println(id);
//		System.out.println(pw);
//		return "day06/pro";
//	}
	
}
