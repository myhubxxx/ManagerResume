package cn.mr.domain;

public class OtherLanguage {

	private String englishlevel;
	private Float englishscore;
	private String toefl;	// TOEFL
	private String gre;		// GRE
	private String gmat;	// GMAT
	private String ielts;	// IELTS
	private String toeic;	// TOEIc
	private String sat;		// SAT
	private String othercontent; // other language info
	private String sid;
	public String getEnglishlevel() {
		return englishlevel;
	}
	public void setEnglishlevel(String englishlevel) {
		this.englishlevel = englishlevel;
	}
	public Float getEnglishscore() {
		return englishscore;
	}
	public void setEnglishscore(Float englishscore) {
		this.englishscore = englishscore;
	}
	public String getToefl() {
		return toefl;
	}
	public void setToefl(String toefl) {
		this.toefl = toefl;
	}
	public String getGre() {
		return gre;
	}
	public void setGre(String gre) {
		this.gre = gre;
	}
	public String getGmat() {
		return gmat;
	}
	public void setGmat(String gmat) {
		this.gmat = gmat;
	}
	public String getIelts() {
		return ielts;
	}
	public void setIelts(String ielts) {
		this.ielts = ielts;
	}
	public String getToeic() {
		return toeic;
	}
	public void setToeic(String toeic) {
		this.toeic = toeic;
	}
	public String getSat() {
		return sat;
	}
	public void setSat(String sat) {
		this.sat = sat;
	}
	public String getOthercontent() {
		return othercontent;
	}
	public void setOthercontent(String othercontent) {
		this.othercontent = othercontent;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "OtherLanguage [englishlevel=" + englishlevel
				+ ", englishscore=" + englishscore + ", toefl=" + toefl
				+ ", gre=" + gre + ", gmat=" + gmat + ", ielts=" + ielts
				+ ", toeic=" + toeic + ", sat=" + sat + ", othercontent="
				+ othercontent + ", sid=" + sid + "]";
	}
	
	
	
}
