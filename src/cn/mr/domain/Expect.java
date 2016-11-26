package cn.mr.domain;

public class Expect {

	private String firstcity;
	private String secondcity;
	private String expectdirection; // work direction
	private String expectposition;  // work position
	private Integer expectsalary;	// work salary
	private String selfevaluate;	// zi wo ping jia
	private String sid;
	public String getFirstcity() {
		return firstcity;
	}
	public void setFirstcity(String firstcity) {
		this.firstcity = firstcity;
	}
	public String getSecondcity() {
		return secondcity;
	}
	public void setSecondcity(String secondcity) {
		this.secondcity = secondcity;
	}
	public String getExpectdirection() {
		return expectdirection;
	}
	public void setExpectdirection(String expectdirection) {
		this.expectdirection = expectdirection;
	}
	public String getExpectposition() {
		return expectposition;
	}
	public void setExpectposition(String expectposition) {
		this.expectposition = expectposition;
	}
	public Integer getExpectsalary() {
		return expectsalary;
	}
	public void setExpectsalary(Integer expectsalary) {
		this.expectsalary = expectsalary;
	}
	public String getSelfevaluate() {
		return selfevaluate;
	}
	public void setSelfevaluate(String selfevaluate) {
		this.selfevaluate = selfevaluate;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Expect [firstcity=" + firstcity + ", secondcity=" + secondcity
				+ ", expectdirection=" + expectdirection + ", expectposition="
				+ expectposition + ", expectsalary=" + expectsalary
				+ ", selfevaluate=" + selfevaluate + ", sid=" + sid + "]";
	}
	
	
}
