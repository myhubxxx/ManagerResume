package cn.mr.domain;

import java.util.Date;

public class WorkExperience {

	private String wid;
	private String wloaction; // shi jian company
	private String wpost;	// 	shi jian job/work
	private Date wdate;		// start time
	private Date enddate;	// end time 
	private String econtent; // shi jian content
	private String sid;
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	public String getWloaction() {
		return wloaction;
	}
	public void setWloaction(String wloaction) {
		this.wloaction = wloaction;
	}
	public String getWpost() {
		return wpost;
	}
	public void setWpost(String wpost) {
		this.wpost = wpost;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getEcontent() {
		return econtent;
	}
	public void setEcontent(String econtent) {
		this.econtent = econtent;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "WorkExperience [wid=" + wid + ", wloaction=" + wloaction
				+ ", wpost=" + wpost + ", wdate=" + wdate + ", enddate="
				+ enddate + ", econtent=" + econtent + ", sid=" + sid + "]";
	}
	
	
}
