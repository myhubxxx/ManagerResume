package cn.mr.domain;

import java.util.Date;

public class StudentInfo {

	private String sid;
	private String infoname;	// real name
	private String idcard;		// shen fen zheng	
	private String infosex;		// sex
	private Date infobirthday;	// birthday
	private String infonaction;	// ming zu
	private String birthdayplace;// ji guan or home address
	private String profession;	// zhuan ye
	private String tel;			// tellphone
	private String email;		// email
	private String professionaldirection;// zhuan ye direction
	private String specialty;		// te chang
	private String professionallession; // zhuan ye lesson
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getInfoname() {
		return infoname;
	}
	public void setInfoname(String infoname) {
		this.infoname = infoname;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getInfosex() {
		return infosex;
	}
	public void setInfosex(String infosex) {
		this.infosex = infosex;
	}
	public Date getInfobirthday() {
		return infobirthday;
	}
	public void setInfobirthday(Date infobirthday) {
		this.infobirthday = infobirthday;
	}
	public String getInfonaction() {
		return infonaction;
	}
	public void setInfonaction(String infonaction) {
		this.infonaction = infonaction;
	}
	public String getBirthdayplace() {
		return birthdayplace;
	}
	public void setBirthdayplace(String birthdayplace) {
		this.birthdayplace = birthdayplace;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfessionaldirection() {
		return professionaldirection;
	}
	public void setProfessionaldirection(String professionaldirection) {
		this.professionaldirection = professionaldirection;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getProfessionallession() {
		return professionallession;
	}
	public void setProfessionallession(String professionallession) {
		this.professionallession = professionallession;
	}
	@Override
	public String toString() {
		return "StudentInfo [sid=" + sid + ", infoname=" + infoname
				+ ", idcard=" + idcard + ", infosex=" + infosex
				+ ", infobirthday=" + infobirthday + ", infonaction="
				+ infonaction + ", birthdayplace=" + birthdayplace
				+ ", profession=" + profession + ", tel=" + tel + ", email="
				+ email + ", professionaldirection=" + professionaldirection
				+ ", specialty=" + specialty + ", professionallession="
				+ professionallession + "]";
	}
	
	
	
	
}
