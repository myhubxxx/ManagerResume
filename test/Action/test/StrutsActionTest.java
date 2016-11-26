package Action.test;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsActionTest extends ActionSupport {

	public String exec(){
		System.out.println(" in struts");
		return "success";
	}
	
}
