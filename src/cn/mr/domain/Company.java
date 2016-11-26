package cn.mr.domain;

public class Company {
	
	private String cid;
	private String cusername;
	private String cpassword;
	private String ccompanyname;
	private String ccompanynumber;
	private Integer cisverify;// 0: No; 1:YES
	private Long orderby;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCusername() {
		return cusername;
	}
	public void setCusername(String cusername) {
		this.cusername = cusername;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getCcompanyname() {
		return ccompanyname;
	}
	public void setCcompanyname(String ccompanyname) {
		this.ccompanyname = ccompanyname;
	}
	public String getCcompanynumber() {
		return ccompanynumber;
	}
	public void setCcompanynumber(String ccompanynumber) {
		this.ccompanynumber = ccompanynumber;
	}
	public Integer getCisverify() {
		return cisverify;
	}
	public void setCisverify(Integer cisverify) {
		this.cisverify = cisverify;
	}
	public Long getOrderby() {
		return orderby;
	}
	public void setOrderby(Long orderby) {
		this.orderby = orderby;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cusername=" + cusername
				+ ", cpassword=" + cpassword + ", ccompanyname=" + ccompanyname
				+ ", ccompanynumber=" + ccompanynumber + ", cisverify="
				+ cisverify + ", orderby=" + orderby + "]";
	}
	
	
	
	
	

}
