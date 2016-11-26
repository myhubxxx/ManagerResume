package Dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import util.CommonUtils;
import util.SessionFactoryUtils;
import cn.mr.dao.CompanyDao;
import cn.mr.dao.impl.CompanyDaoImpl;
import cn.mr.domain.Company;

public class CompanyDaoTest implements DaoTest {
	public CompanyDao dao = new CompanyDaoImpl();
	@Test
	public void add() {
		Company bean = new Company();
			bean.setCid(CommonUtils.uuid());
			bean.setCcompanyname("alibaba");
			bean.setCcompanynumber("123456");
			bean.setCusername("alibaba");
			bean.setCpassword("123");
			bean.setCisverify(0);
		try {
			dao.add("cn.mr.CompanyMapper.insert", bean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void update() {
		Company bean = new Company();
		bean.setCid("A664E5585DB948F48655701BC5C51536");
		bean.setCcompanyname("alibaba_change");
		bean.setCcompanynumber("123456_change");
		bean.setCusername("alibaba");
		bean.setCpassword("123");
		bean.setCisverify(1);
	try {
		dao.updateById("cn.mr.CompanyMapper.updateById", bean);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	SessionFactoryUtils.getSession().commit();
		
	}

	@Test
	public void delete() {
		
		try {
			dao.deleteById("cn.mr.CompanyMapper.deleteById", "D9362C4976AE40399199952A907338B4");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void get() {
		try {
			System.out.println(dao.getById("cn.mr.CompanyMapper.getById", "A664E5585DB948F48655701BC5C51536"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void getNumber() {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("attrUrl", "1=1 and cpassword='123'");
			System.out.println(SessionFactoryUtils.getSession().selectOne("cn.mr.CompanyMapper.getAllCount", map));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
