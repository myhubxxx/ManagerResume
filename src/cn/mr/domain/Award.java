package cn.mr.domain;

import java.util.Date;

public class Award {
	
	private String aid;
	private Date adate;
	private String awardname;
	private String awardlevel;
	private String sid;
	
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public Date getAdate() {
		return adate;
	}
	public void setAdate(Date adate) {
		this.adate = adate;
	}
	public String getAwardname() {
		return awardname;
	}
	public void setAwardname(String awardname) {
		this.awardname = awardname;
	}
	public String getAwardlevel() {
		return awardlevel;
	}
	public void setAwardlevel(String awardlevel) {
		this.awardlevel = awardlevel;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Award [aid=" + aid + ", adate=" + adate + ", awardname="
				+ awardname + ", awardlevel=" + awardlevel + ", sid=" + sid
				+ "]";
	}
	
	
	

}
