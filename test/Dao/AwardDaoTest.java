package Dao;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

import util.CommonUtils;
import util.SessionFactoryUtils;
import cn.mr.dao.AwardDao;
import cn.mr.dao.impl.AwardDaoImpl;
import cn.mr.domain.Award;

public class AwardDaoTest implements DaoTest {
	
	private AwardDao dao = new AwardDaoImpl();

	@Test
	public void add() {
		Award a = new Award();
			a.setAid(CommonUtils.uuid());
			a.setAdate(new Date());
			a.setAwardname("蓝桥杯比赛一等奖");
			a.setAwardlevel("国家级");
			
			a.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
		try {
			dao.add("cn.mr.AwardMapper.insert", a);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void update() {
		Award a = new Award();
			a.setAid("258A911BB177408BBA75C33E7BB30B91");
			a.setAdate(new Date());
			a.setAwardname("java比赛一等奖");
			a.setAwardlevel("国家级");
			
			a.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
		try {
			dao.updateById("cn.mr.AwardMapper.updateByAid", a);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
			
	}

	@Test
	public void delete() {
		try {
			dao.deleteById("cn.mr.AwardMapper.deleteByAid", "A3F12E0993DF450FB9311D8AA032A6A6");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void get() {
		try {
			System.out.println(dao.getById("cn.mr.AwardMapper.getByAid", "258A911BB177408BBA75C33E7BB30B91"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
