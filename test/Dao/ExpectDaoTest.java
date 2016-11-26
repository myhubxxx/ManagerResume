package Dao;

import java.sql.SQLException;

import org.junit.Test;

import util.SessionFactoryUtils;
import cn.mr.dao.ExpectDao;
import cn.mr.dao.impl.ExpectDaoImpl;
import cn.mr.domain.Expect;

public class ExpectDaoTest implements DaoTest {
	public ExpectDao dao = new ExpectDaoImpl();
	@Test
	public void add() {
		Expect e = new Expect();
			e.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
			e.setFirstcity("成都");
			e.setSecondcity("杭州");
			e.setExpectdirection("java研发工程师");
			e.setExpectposition("技术总监");
			e.setExpectsalary(100000);
			e.setSelfevaluate("爱好编程，开源");
		
			try {
				dao.add("cn.mr.ExpectMapper.insert", e);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void update() {
		Expect e = new Expect();
		e.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
		e.setFirstcity("成都_change");
		e.setSecondcity("杭州_change");
		e.setExpectdirection("java大数据——change");
		e.setExpectposition("技术总监_change");
		e.setExpectsalary(100000+8);
		e.setSelfevaluate("爱好编程，开源_change");
	
		try {
			dao.updateById("cn.mr.ExpectMapper.updateById", e);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
		
	}

	@Test
	public void delete() {
		
		try {
			dao.deleteById("cn.mr.ExpectMapper.deleteById", "04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void get() {
		
		try {
			System.out.println(dao.getById("cn.mr.ExpectMapper.getById", "04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
