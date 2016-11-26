package Service;

import org.junit.Test;

import util.BeanFactory;
import util.PageBean;
import cn.mr.domain.Company;
import cn.mr.service.CompanyService;


public class CompanyServiceTest {
	
	CompanyService service = (CompanyService) BeanFactory.get("CompanyService");
	@Test
	public void pageTest(){
		PageBean<Company> page = new PageBean<Company>();
			page.setCurrentPage(1);
		
		Company bean = new Company();
			bean.setCisverify(1);
		
		System.out.println(service.getPage(page, bean).getPage() );
	}
	

}
