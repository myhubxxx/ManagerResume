package cn.mr.domain;

/**
 * use to describe the Manager to manage the system
 * there are some infomation to the admin
 * account,password, the admin's name 
 * the admin's level 
 * @author Administrator
 *
 */
public class Admin {
	
	private String aid;	// the key
	private String ausername;	// username
	private String apassword; // password
	private String arealname; // real name
	private Integer alevel; // the admin level
	private Long orderby; // order by 
	
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getAusername() {
		return ausername;
	}
	public void setAusername(String ausername) {
		this.ausername = ausername;
	}
	public String getApassword() {
		return apassword;
	}
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	public String getArealname() {
		return arealname;
	}
	public void setArealname(String arealname) {
		this.arealname = arealname;
	}
	public Integer getAlevel() {
		return alevel;
	}
	public void setAlevel(Integer alevel) {
		this.alevel = alevel;
	}
	public Long getOrderby() {
		return orderby;
	}
	public void setOrderby(Long orderby) {
		this.orderby = orderby;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", ausername=" + ausername
				+ ", apassword=" + apassword + ", arealname=" + arealname
				+ ", alevel=" + alevel + ", orderby=" + orderby + "]";
	}
	
	

}
