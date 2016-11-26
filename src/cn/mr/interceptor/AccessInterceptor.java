package cn.mr.interceptor;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AccessInterceptor extends AbstractInterceptor {

	/**
	 *  user to validate the user is login
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ac = invocation.getInvocationContext();
		HttpSession session =  ServletActionContext.getRequest().getSession();

		Object sessionUser =  session.getAttribute("sessionUser");
		
		if(sessionUser != null){
		
			return "login";
		}else{
			
			return invocation.invoke();
		}
		
	}

}
