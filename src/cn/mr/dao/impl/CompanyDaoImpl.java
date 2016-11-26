package cn.mr.dao.impl;

import cn.mr.dao.CompanyDao;
import cn.mr.domain.Company;

public class CompanyDaoImpl extends BaseDaoImpl<Company> implements CompanyDao {

	@Override
	public Company getByUserName(String cusername) {
		Company result = null;
		try{
			
			result = session.selectOne("cn.mr.CompanyMapper.getByUserName", cusername);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}

}
