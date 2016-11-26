package cn.mr.dao;

import cn.mr.domain.Company;

public interface CompanyDao extends BaseDao<Company>{

	public Company getByUserName(String cusername);

}
