package cn.mr.dao.impl;

import cn.mr.dao.AdminDao;
import cn.mr.domain.Admin;

public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao {

	@Override
	public Admin getByUserName(String username) {
		Admin result = null;
		try{
			
			result = session.selectOne("cn.mr.AdminMapper.getByUserName", username);
			
			session.commit();
		}catch(Exception e){
			e.printStackTrace();
			session.rollback();
		}
		
		return result;
	}

}
