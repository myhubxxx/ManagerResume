package cn.mr.service;

import util.PageBean;
import cn.mr.domain.Company;

public interface CompanyService {

	public Company getByUserName(String cusername);

	public boolean add(Company formCompany);

	public Company getById(String cid);

	public boolean update(Company dbCompany);

	public PageBean<Company> getPage(PageBean<Company> page, Company formCompany);

}
