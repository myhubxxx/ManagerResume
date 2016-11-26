package cn.mr.domain;

import java.util.Date;

public class Education {
	
	private String eid;
	private Date startdate; 
	private Date enddate;
	private String schoolname;
	private String profession; // zhuan ye
	private String educational;	// xue li
	private String degree;		// xue wei 
	private String rank;		// pai ming
	private Integer score;		// zhong he fen shu
	private String professionlesson; // zhuan ye ke 
	private String certificateman; // prove man/teacher
	private String certificatetel; // prove tellphone
	private String sid;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
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
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public String getEducational() {
		return educational;
	}
	public void setEducational(String educational) {
		this.educational = educational;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getProfessionlesson() {
		return professionlesson;
	}
	public void setProfessionlesson(String professionlesson) {
		this.professionlesson = professionlesson;
	}
	public String getCertificateman() {
		return certificateman;
	}
	public void setCertificateman(String certificateman) {
		this.certificateman = certificateman;
	}
	public String getCertificatetel() {
		return certificatetel;
	}
	public void setCertificatetel(String certificatetel) {
		this.certificatetel = certificatetel;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Education [eid=" + eid + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", schoolname=" + schoolname
				+ ", profession=" + profession + ", educational=" + educational
				+ ", degree=" + degree + ", rank=" + rank + ", score=" + score
				+ ", professionlesson=" + professionlesson
				+ ", certificateman=" + certificateman + ", certificatetel="
				+ certificatetel + ", sid=" + sid + "]";
	}


	
	
	
	

}
