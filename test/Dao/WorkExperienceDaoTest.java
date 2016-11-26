package Dao;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

import util.CommonUtils;
import util.SessionFactoryUtils;
import cn.mr.dao.WorkExperienceDao;
import cn.mr.dao.impl.WorkExperienceDaoImpl;
import cn.mr.domain.WorkExperience;

public class WorkExperienceDaoTest implements DaoTest {
	public WorkExperienceDao dao = new WorkExperienceDaoImpl();
	@Test
	public void add() {
		WorkExperience w = new WorkExperience();
			w.setWid(CommonUtils.uuid());
			w.setWloaction("安克思");
			w.setWpost("java实习");
			w.setWdate(new Date());
			w.setEcontent("主要参与校内简历制作，实现简历的阅览——change");
			
			w.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
			
		try {
			dao.add("cn.mr.WorkExperienceMapper.insert", w);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
			
	}

	@Test
	public void update() {
		WorkExperience w = new WorkExperience();
		w.setWid("C05A8605695A4BD58000E4ED69D420A0");
		w.setWloaction("安克思_change");
		w.setWpost("java实习_change");
		w.setWdate(new Date());
		w.setEcontent("主要参与校内简历制作，实现简历的阅览——change in 2");
		
		w.setSid("8F195AC4E55E4B68803F2564DA817B2B");
		
	try {
		dao.updateById("cn.mr.WorkExperienceMapper.updateByWid", w);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	SessionFactoryUtils.getSession().commit();
		
	}

	@Test
	public void delete() {
		
		try {
			dao.deleteById("cn.mr.WorkExperienceMapper.deleteByWid", "9BF545C76B474A58A4A8A5C2CDA49D89");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void get() {
		
		try {
			System.out.println(dao.getById("cn.mr.WorkExperienceMapper.getByWid", "9BF545C76B474A58A4A8A5C2CDA49D89"));
			System.out.println(dao.getById("cn.mr.WorkExperienceMapper.getByWid", "C05A8605695A4BD58000E4ED69D420A0"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
