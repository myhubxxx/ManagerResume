package test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import util.SessionFactoryUtils;

public class SqlFacrtoryTest {

	@Test
	public void testSqlSession(){
		SqlSession session = SessionFactoryUtils.getSession();
		
		System.out.println(session);
		
		
		
	}
}
