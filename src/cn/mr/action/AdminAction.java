package cn.mr.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import util.BeanFactory;
import cn.mr.domain.Admin;
import cn.mr.service.AdminService;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {
	private String verifyCode;
	private Admin formAdmin;

	// inject the service
	private AdminService service = (AdminService) BeanFactory
			.get("AdminService");
	HttpSession session = ServletActionContext.getRequest().getSession();
	
	/**
	 * admin login
	 * @return
	 */
	public String login() {
		System.out.println(formAdmin);

		try {
			String sessionCode = (String) session.getAttribute("verifyCode");
			// verifyCode sessionCode don't is null or " "
			if (verifyCode != null && sessionCode != null
					&& !verifyCode.trim().isEmpty()
					&& !sessionCode.trim().isEmpty()) {

				if (verifyCode.equalsIgnoreCase(sessionCode)) { // right
																// verifyCode

					if (formAdmin.getAusername() != null
							&& !formAdmin.getAusername().trim().isEmpty()) {// username
																			// not
																			// null
						Admin dbAdmin = service.getByUserName(formAdmin
								.getAusername());
						if (dbAdmin != null
								&& dbAdmin.getApassword().equals(
										formAdmin.getApassword())) { // right password
							// set password null
							dbAdmin.setApassword(null);
							// put admin session
							session.setAttribute("sessionUser", dbAdmin);

							return "success";
						}
					}
				}
			}
			return "login";
		} catch (Exception e) {
			e.printStackTrace();
			return "login";
		}
	}

	/**
	 * active company by company'cid
	 * @return
	 */
	public String activeCompany(){
		
		
		return "none";
	}
	
	// -----getter setter method

	public Admin getFormAdmin() {
		return formAdmin;
	}

	public void setFormAdmin(Admin formAdmin) {
		this.formAdmin = formAdmin;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
