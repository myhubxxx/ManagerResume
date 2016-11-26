package cn.mr.dao;

import cn.mr.domain.Admin;

public interface AdminDao extends BaseDao<Admin> {

	public Admin getByUserName(String username);
}
