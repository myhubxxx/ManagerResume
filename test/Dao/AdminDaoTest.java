package Dao;

import java.sql.SQLException;

import org.junit.Test;

import util.CommonUtils;
import util.SessionFactoryUtils;
import cn.mr.dao.AdminDao;
import cn.mr.dao.impl.AdminDaoImpl;
import cn.mr.domain.Admin;

public class AdminDaoTest implements DaoTest {
	
	public AdminDao dao = new AdminDaoImpl();
	@Test
	public void getByName(){
		System.out.println(dao.getByUserName("liuxiang"));
	}
	@Test
	public void add(){
		Admin admin = new Admin();
			admin.setAid(CommonUtils.uuid());
			admin.setAlevel(3);
			admin.setApassword("123");
			admin.setArealname("张三");
			admin.setAusername("zhangsan");
			
		try {
			dao.add("cn.mr.AdminMapper.insert", admin);
			SessionFactoryUtils.getSession().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void update(){
		Admin admin = new Admin();
		admin.setAid("778E1E10CE024FD8A15A41A601CDBB08");
		admin.setAlevel(3+1);
		admin.setApassword("123_change");
		admin.setArealname("张三_change");
		admin.setAusername("zhangsan_change");
		
		try {
			dao.updateById("cn.mr.AdminMapper.updateById", admin);
			SessionFactoryUtils.getSession().commit();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
	}
	@Test
	public void delete()  {
		// TODO Auto-generated method stub
		try {
			dao.deleteById("cn.mr.AdminMapper.deleteById", "sdfsdf");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}
	@Test
	public void get() {
		// TODO Auto-generated method stub
		try {
			System.out.println(dao.getById("cn.mr.AdminMapper.getById", "778E1E10CE024FD8A15A41A601CDBB08"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(dao.getById("cn.mr.AdminMapper.getByUserName", "zhangsan"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
