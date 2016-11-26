package cn.mr.domain;

import java.util.Date;

public class ProjectExperience {

	private String pid;
	private String pname;
	private Date startdate;
	private Date enddate;
	private String responsibility;
	private String summary; // project description or summary
	private String sid;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "ProjectExperience [pid=" + pid + ", pname=" + pname
				+ ", startdate=" + startdate + ", enddate=" + enddate
				+ ", responsibility=" + responsibility + ", summary=" + summary
				+ ", sid=" + sid + "]";
	}
	
	
	
}
