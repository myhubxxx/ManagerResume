package Dao;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

import util.CommonUtils;
import util.SessionFactoryUtils;
import cn.mr.dao.EducationDao;
import cn.mr.dao.impl.EducationDaoImpl;
import cn.mr.domain.Education;

public class EducationTest implements DaoTest {
	public EducationDao dao = new EducationDaoImpl();
	@Test
	public void add() {
		Education e = new Education();
			e.setEid(CommonUtils.uuid());
			e.setStartdate(new Date());
			e.setEnddate(new Date());
			e.setSchoolname("西南菜油大学");
			e.setProfession("计科");
			e.setEducational("本科");
			e.setDegree("学士");
			e.setRank("5% Top");
			e.setScore(500);
			e.setProfessionlesson("数据结构，数据库，C++");
			e.setCertificateman("王八");
			e.setCertificatetel("18428346867");
		
			e.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
		try {
			dao.add("cn.mr.EducationMapper.insert", e);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void update() {
		Education e = new Education();
		e.setEid("D7AC945C05D442A9901F978D1A447A90");
		e.setStartdate(new Date());
		e.setEnddate(new Date());
		e.setSchoolname("西南菜油大学_change");
		e.setProfession("软降工程_chage");
		e.setEducational("本科_change");
		e.setDegree("学士_change");
		e.setRank("5% Top_ch");
		e.setScore(500+5);
		e.setProfessionlesson("数据结构，数据库，C++,change");
		e.setCertificateman("王八_change");
		e.setCertificatetel("18428346868");
	
		e.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
		try {
			dao.updateById("cn.mr.EducationMapper.updateByEid", e);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
		
		
	}

	@Test
	public void delete() {
		
		try {
			dao.deleteById("cn.mr.EducationMapper.deleteByEid", "D7AC945C05D442A9901F978D1A447A90");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void get() {
		// TODO Auto-generated method stub
		try {
			System.out.println(dao.getById("cn.mr.EducationMapper.getByEid", "D7AC945C05D442A9901F978D1A447A90"));
			System.out.println(dao.getById("cn.mr.EducationMapper.getByEid", "CFC0B8EF0E724F149EAA005A9187594D"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
