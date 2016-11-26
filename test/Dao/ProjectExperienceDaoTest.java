package Dao;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

import util.CommonUtils;
import util.SessionFactoryUtils;
import cn.mr.dao.ProjectExperienceDao;
import cn.mr.dao.impl.ProjectExperienceDaoImpl;
import cn.mr.domain.ProjectExperience;

public class ProjectExperienceDaoTest implements DaoTest {
	public ProjectExperienceDao dao = new ProjectExperienceDaoImpl();
	@Test
	public void add() {
		ProjectExperience p = new ProjectExperience();
			p.setPid(CommonUtils.uuid());
			p.setPname("教务成绩爬取系统");
			p.setStartdate(new Date(new Date().getTime() - 1000*60*60*24*100));
			p.setEnddate(new Date());
			p.setResponsibility("主要负责数据层的封装，以及业务逻辑");
			p.setSummary("团队合作友好，按时完成");
			
			p.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
			
		try {
			dao.add("cn.mr.ProjectExperienceMapper.insert", p);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void update() {
		ProjectExperience p = new ProjectExperience();
		p.setPid("E2D594D7C26847CF891F0BB45B5EA7E7");
		p.setPname("教务成绩爬取系统_change");
		p.setStartdate(new Date(new Date().getTime() - 1000*60*60*24*100));
		p.setEnddate(new Date());
		p.setResponsibility("主要负责数据层的封装，以及业务逻辑");
		p.setSummary("团队合作友好，按时完成");
		
		p.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
		
		try {
			dao.updateById("cn.mr.ProjectExperienceMapper.updateByEid", p);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
		
	}

	@Test
	public void delete() {
		
		try {
			dao.deleteById("cn.mr.ProjectExperienceMapper.deleteByEid", "E2D594D7C26847CF891F0BB45B5EA7E7");
			SessionFactoryUtils.getSession().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void get() {
		try {
			System.out.println(dao.getById("cn.mr.ProjectExperienceMapper.getByEid", "E2D594D7C26847CF891F0BB45B5EA7E7"));
			System.out.println(dao.getById("cn.mr.ProjectExperienceMapper.getByEid", "33A8BC18127A44C18D8B987B427263D8"));
			SessionFactoryUtils.getSession().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
