package cn.mr.service.impl;

import util.BeanFactory;
import cn.mr.dao.AdminDao;
import cn.mr.domain.Admin;
import cn.mr.service.AdminService;

public class AdminServiceImpl implements AdminService {

	private AdminDao dao = (AdminDao) BeanFactory.get("AdminDao");
	@Override
	public Admin getByUserName(String ausername) {
		Admin result = null;
		try{
			
			result = dao.getByUserName(ausername);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return result;
	}

}
