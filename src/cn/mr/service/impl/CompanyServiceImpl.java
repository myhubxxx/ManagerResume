package cn.mr.service.impl;

import java.util.HashMap;
import java.util.Map;

import util.BeanFactory;
import util.CommonUtils;
import util.PageBean;
import util.SessionFactoryUtils;
import cn.mr.dao.CompanyDao;
import cn.mr.domain.Company;
import cn.mr.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

	private CompanyDao dao = (CompanyDao) BeanFactory.get("CompanyDao");

	@Override
	public Company getByUserName(String cusername) {
		Company result = null;
		try {

			result = dao.getByUserName(cusername);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return result;
	}

	@Override
	public boolean add(Company formCompany) {
		/* in service 
		 * you first search the CompanyName from database
		 * not exists  add
		 * exists throw exception	  
		 */
		try{
			
			Company com = this.getByUserName(formCompany.getCusername());
			if(com == null){
				formCompany.setCid(CommonUtils.uuid());
				formCompany.setCisverify(0);
				
				// add the company to database
				dao.add("cn.mr.CompanyMapper.insert", formCompany);
				
				SessionFactoryUtils.getSession().commit();
				return true;
			}else{
				throw new RuntimeException("用户已存在");
			}
		
		}catch(Exception e){
			e.printStackTrace();
			SessionFactoryUtils.getSession().rollback();
			throw new RuntimeException(e);
		}
	}

	@Override
	public Company getById(String cid) {
		Company result = null;
		try{
			
			result = dao.getById("cn.mr.CompanyMapper.getById", cid);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean update(Company dbCompany) {
		try{
			
			dao.updateById("cn.mr.CompanyMapper.updateById", dbCompany);
			
			SessionFactoryUtils.getSession().commit();
			
			return true;
		}catch(Exception e){
			e.printStackTrace();
			SessionFactoryUtils.getSession().rollback();
			
			return false;
		}
		
		
		
	}

	@Override
	public PageBean<Company> getPage(PageBean<Company> page, Company formCompany) {
		StringBuilder sb = new StringBuilder();
		
		try{
			if(page.getAttrUrl() != null ){
				if(page.getAttrUrl().indexOf(" and ") == -1)
					sb.append(" and " + page.getAttrUrl());
				else
					sb.append(" " + page.getAttrUrl());
			}
			
			if(formCompany != null && formCompany.getCisverify() != null) sb.append(" and cisverify=" + formCompany.getCisverify());
			
			String attrUrl = null;
			if(sb.length() != 0){
				attrUrl = sb.toString();
			}
			
			// get the numbers of record
			Number  number = dao.allCount("cn.mr.CompanyMapper.getAllCount", attrUrl);
			int count = number.intValue();
			page.setTotalRecord(count);
			
			// get the data page 
			long lose = (page.getCurrentPage() == 0) ? 0: ( (page.getCurrentPage()-1)*page.getPageSize() );
			Map<String, Object> attrMap = new HashMap<String, Object>();
				attrMap.put("attrUrl", attrUrl); // set the argument
				attrMap.put("lose", lose);
				attrMap.put("pageSize", page.getPageSize());
			
			page.setAttrUrl(attrUrl);
			page.setPage(dao.getCurrentPage("cn.mr.CompanyMapper.getCurrentPage", attrMap) );
			page.getStart();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return page;
	}



}
