package com.test.persistence;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	//초기화 블럭에서 oracle 드라이버 로딩
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		try (Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@javaking.iptime.org:1521:ORCL",
				"java01", "java01" // username , password
				)){
			log.info(conn);
			
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}

}
