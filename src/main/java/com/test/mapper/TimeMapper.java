package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.test.model.TestDTO;

public interface TimeMapper {
	
	//#1.어노테이션으로 쿼리문 작성/실행 -> 간단한 쿼리문 실행시킬 때
	@Select("SELECT SYSDATE FROM DUAL")
	public String getTime();
	
	//#2. 인터페이스 + XML 쿼리문 작성 / 실행
	//리턴타입 : 쿼리문 실행결과를 받고 싶은 타입 작성, 레코드 수에 따라 생각
	//레코드가 여러개 결과로 나온다 -> List
	//레코드가 1개면 result 타입과 동일하게 작성
	public String getTime2();
	
	//select id from test : 레코드가 2개이상 나옴 -> List
	public List<String> getAllId();
	
	//select * from test where id=#{id}
	public TestDTO getMember(String id);
	
	//insert into test values()
	public int insertMember(TestDTO dto);
		
	//회원 한 명 비밀번호 수정 : update test set pw=#{pw} where id = #{}
	public int modifyPw(TestDTO dto);	
	
	//회원 삭제 deleteMember : delete from test where id=#{id} : <delete>
	public int deleteMember(String id);
	
	
	
	
	
	
}
