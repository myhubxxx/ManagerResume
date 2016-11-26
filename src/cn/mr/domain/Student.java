package cn.mr.domain;

/**
 * use to describe the student's simple infomation of account,password,
 * and the student's name. 
 * @author Administrator
 *
 */
public class Student {
	
	private String sid;	// the key
	private String snumber;	// length 12 number
	private String spassword; // student password
	private String susername; //  student name
	private Long orderby; // order by
	private Integer employee; // is employee；0 not employee, 1 employee
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSnumber() {
		return snumber;
	}
	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public String getSusername() {
		return susername;
	}
	public void setSusername(String susername) {
		this.susername = susername;
	}
	public Long getOrderby() {
		return orderby;
	}
	public void setOrderby(Long orderby) {
		this.orderby = orderby;
	}
	public Integer getEmployee() {
		return employee;
	}
	public void setEmployee(Integer employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", snumber=" + snumber + ", spassword="
				+ spassword + ", susername=" + susername + ", orderby="
				+ orderby + ", employee=" + employee + "]";
	}
	

	

}
