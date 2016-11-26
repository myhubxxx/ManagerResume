package Dao;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

import util.SessionFactoryUtils;
import cn.mr.dao.StudentInfoDao;
import cn.mr.dao.impl.StudentInfoDaoImpl;
import cn.mr.domain.StudentInfo;

public class StudentInfoDaoTest implements DaoTest {
	public StudentInfoDao dao = new StudentInfoDaoImpl();
	@Test
	public void add() {
		StudentInfo s = new StudentInfo();
			s.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
			s.setInfoname("");
			s.setIdcard("511602199911111112");
			s.setInfosex("男");
			s.setInfobirthday(new Date());
			s.setInfonaction("汉族");
			s.setBirthdayplace("广安");
			s.setProfession("软降工程");
			s.setTel("18428346868");
			s.setEmail("xy62310@163.com");
			s.setProfessionaldirection("java开发");
			s.setSpecialty("擅长java");
			s.setProfessionallession("java,C++,C");
			
		try {
			dao.add("cn.mr.StudentInfoMapper.insert", s);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
			
	}

	@Test
	public void update() {
		StudentInfo s = new StudentInfo();
		s.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
		s.setInfoname("");
		s.setIdcard("511602199911111118");
		s.setInfosex("女");
		s.setInfobirthday(new Date());
		s.setInfonaction("满清");
		s.setBirthdayplace("广安_前锋");
		s.setProfession("软降工程2013");
		s.setTel("18428346866");
		s.setEmail("xy62310@165.com");
		s.setProfessionaldirection("java开发change");
		s.setSpecialty("擅长java,cahnge");
		s.setProfessionallession("java,C++,C,cahnge");
		
		try {
			dao.updateById("cn.mr.StudentInfoMapper.updateById", s);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
		
	}

	@Test
	public void delete() {
		
		try {
			dao.deleteById("cn.mr.StudentInfoMapper.deleteById", "8F195AC4E55E4B68803F2564DA817B2B");
			SessionFactoryUtils.getSession().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void get() {
		
		try {
			System.out.println(dao.getById("cn.mr.StudentInfoMapper.getById", "8F195AC4E55E4B68803F2564DA817B2B"));
			System.out.println(dao.getById("cn.mr.StudentInfoMapper.getById", "04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
