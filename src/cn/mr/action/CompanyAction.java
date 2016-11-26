package cn.mr.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import util.BeanFactory;
import util.PageBean;
import cn.mr.domain.Admin;
import cn.mr.domain.Company;
import cn.mr.service.CompanyService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CompanyAction extends ActionSupport {
	//---- the page arrguments
	private String nowPage;
	private String attrUrl;
	// ------ page info end
	
	private String verifyCode;
	private Company formCompany;
	
	// inject service
	private CompanyService service = (CompanyService) BeanFactory.get("CompanyService");
	HttpSession session = ServletActionContext.getRequest().getSession();
	
	/**
	 * login company
	 * @return
	 */
	public String login(){
		System.out.println(formCompany);
		
		try{
			String sessionCode = (String) session.getAttribute("verifyCode");
			if(sessionCode != null && verifyCode != null && !sessionCode.trim().isEmpty() && !verifyCode.trim().isEmpty()){
				// sessionCode verifyCode  not null
				if(sessionCode.equalsIgnoreCase(verifyCode)){ // reight code  
					
					if(formCompany.getCusername() != null && !formCompany.getCusername().trim().isEmpty()){
						// cusername not empty
						Company dbCompany = service.getByUserName(formCompany.getCusername());
						
						if(dbCompany != null && dbCompany.getCpassword().equals(formCompany.getCpassword()) && dbCompany.getCisverify() == 1){ // right password
							// set password null
							dbCompany.setCpassword(null);
							// put to session
							session.setAttribute("sessionUser", dbCompany);
							
							return "success";
						}
					}
				}
			}
			return "login";
		}catch(Exception e){
			e.printStackTrace();
			return "login";	
		}
	}
	
	/**
	 * company regist user
	 * @return
	 */
	public String regist(){
		System.out.println(formCompany);
		
		try{
			String sessionCode = (String) session.getAttribute("verifyCode");
			if(sessionCode != null && verifyCode != null && !sessionCode.trim().isEmpty() && !verifyCode.trim().isEmpty()){
				// sessionCode verifyCode  not null
				if(sessionCode.equalsIgnoreCase(verifyCode)){ // reight code  
					
					boolean flag = service.add(formCompany);
					if( flag ){ // 添加成功
						
						ServletActionContext.getContext().put("registSuccess", 1);
						// go to success page
						return "success";
					}
				}
				//
				ServletActionContext.getContext().put("registSuccess", -1);
			}	
			
			return "regist";
		}catch(Exception e){
			e.printStackTrace();
			return "regist";
		}
		
	}
	
	/**
	 * active company
	 * @return
	 */
	public String activeCompany(){
		try{
			if(formCompany.getCid() != null && !formCompany.getCid().trim().isEmpty() && (session.getAttribute("sessionUser") instanceof Admin) ){// have cid
				
				Company dbCompany = service.getById(formCompany.getCid());
				if(dbCompany != null  ){
					// set active access
					dbCompany.setCisverify(1);
					// save active
					if(service.update(dbCompany)){ // update success
						
						// active the company
						return "updateSuccess";
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		return "regist";
	}
	/**
	 * delete the some company
	 * @return
	 */
	public String deleteCompany(){
		
		
		
		return null;
	}
	
	/**
	 * show company 
	 * active
	 * not active 
	 * @return
	 */
	public String showPage(){
		// the data that Page show
		PageBean<Company> page = new PageBean<Company>();
		
		try{
//			if(formCompany.getCisverify() == null){
//				formCompany.setCisverify(0);
//			}
			// if nowPage is error, nowPage = 1;
			try{
				page.setCurrentPage( Integer.parseInt(nowPage) );
			}catch(NumberFormatException e){
				page.setCurrentPage(1);
			} 
			// set the search arrguments
			if(attrUrl != null){
				attrUrl = attrUrl.replace("%20", " ");
				page.setAttrUrl(attrUrl);
			}
			
			// get the page
			page = 	service.getPage(page, formCompany);
			
			
			ActionContext.getContext().put("page", page);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return "companyShow";
	}
	
	// ---------getter setter method 
	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public Company getFormCompany() {
		return formCompany;
	}

	public void setFormCompany(Company formCompany) {
		this.formCompany = formCompany;
	}

	public String getNowPage() {
		return nowPage;
	}

	public void setNowPage(String nowPage) {
		this.nowPage = nowPage;
	}

	public String getAttrUrl() {
		return attrUrl;
	}

	public void setAttrUrl(String attrUrl) {
		this.attrUrl = attrUrl;
	}
	
	
	
	
}
