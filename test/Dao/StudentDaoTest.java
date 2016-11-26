package Dao;

import java.sql.SQLException;

import org.junit.Test;

import util.CommonUtils;
import util.SessionFactoryUtils;
import cn.mr.dao.StudentDao;
import cn.mr.dao.impl.StudentDaoImpl;
import cn.mr.domain.Student;

public class StudentDaoTest implements DaoTest{
	public StudentDao dao = new StudentDaoImpl();
	@Test
	public void add() {
		Student s = new Student();
			s.setSid(CommonUtils.uuid());
			s.setSnumber("201305020347");
			s.setSusername("employee");
			s.setSpassword("123");
			
		try {
			dao.add("cn.mr.StudentMapper.insert", s);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void update() {
		Student s = new Student();
		s.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
		s.setSnumber("201305020347");
		s.setSusername("李四--change");
		s.setSpassword("123_change");
		s.setEmployee(1);
	try {
		dao.updateById("cn.mr.StudentMapper.updateById", s);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	SessionFactoryUtils.getSession().commit();
		
	}

	@Test
	public void delete() {
		
		try {
			dao.deleteById("cn.mr.StudentMapper.deleteById", "13CF02DC18324ED882E4F4400FB91E8D");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void get() {
		
		try {
			System.out.println(dao.getById("cn.mr.StudentMapper.getById", "04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
