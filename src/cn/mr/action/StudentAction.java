package cn.mr.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import util.BeanFactory;
import cn.mr.domain.Award;
import cn.mr.domain.Education;
import cn.mr.domain.Expect;
import cn.mr.domain.OtherLanguage;
import cn.mr.domain.ProjectExperience;
import cn.mr.domain.Student;
import cn.mr.domain.StudentInfo;
import cn.mr.domain.WorkExperience;
import cn.mr.service.StudentService;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {
	private String verifyCode;
	private Student formStudent;

	/*--------resume info --------*/
	// must info
	private StudentInfo stuInfo;
	private List<Education> edus = new ArrayList<Education>();
	// not must info
	private Expect expect;
	private List<Award> awards = new ArrayList<Award>();
	private List<WorkExperience> works = new ArrayList<WorkExperience>();
	private List<ProjectExperience> projects = new ArrayList<ProjectExperience>();
	private OtherLanguage language;
	//  end form info

	private StudentService service = (StudentService) BeanFactory
			.get("StudentService");
	HttpSession session = ServletActionContext.getRequest().getSession();

	/**
	 * now you should check the student failure redirect to login page right
	 * redirect to success page and put sessionUser
	 * 
	 * @return
	 */
	public String login() {
//		System.out.println(formStudent);

		try {
			String sessionCode = (String) session.getAttribute("verifyCode");
			// sessionCode verifyCode are not null
			if (sessionCode != null && verifyCode != null
					&& !sessionCode.trim().isEmpty()
					&& !verifyCode.trim().isEmpty()) {
				// sessionCode equals verifyCode
				if (sessionCode.equalsIgnoreCase(verifyCode)) { // verifyCode is
																// right
					// check the login account
					if (formStudent.getSnumber() != null
							&& !formStudent.getSnumber().trim().isEmpty()) {// snumber
																			// not
																			// empty
						Student dbStu = service.getByNumber(formStudent
								.getSnumber());
						if (dbStu != null
								&& dbStu.getSpassword().equals(
										formStudent.getSpassword())) {
							// login success
							// set password null
							dbStu.setSpassword(null);
							// put user account to session
							session.setAttribute("sessionUser", dbStu);

							return "success";
						}
					}
				}
			}
			return "login";
		} catch (Exception e) {
			e.printStackTrace();
			return "login";
		}

	}

	/**
	 * the student write the resume by form
	 * some info is Must
	 * 
	 * @return
	 */
	private String writeResume(){
		
		System.out.println("StudentInfo : " + stuInfo);
		System.out.println("Awards : " + awards);
		System.out.println("WorkExperience : " + works);
		System.out.println("ProjectExperience : " + projects);
		System.out.println("OtherLanguage : " + language );
		
		
		
		return "success";
	}
	
	
	public String test() {
		System.out.println(" in test---------- ");
		return SUCCESS;
	}

	// ---------the getter setter method in here
	public Student getFormStudent() {
		return formStudent;
	}

	public void setFormStudent(Student formStudent) {
		this.formStudent = formStudent;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public StudentInfo getStuInfo() {
		return stuInfo;
	}

	public void setStuInfo(StudentInfo stuInfo) {
		this.stuInfo = stuInfo;
	}

	public List<Education> getEdus() {
		return edus;
	}

	public void setEdus(List<Education> edus) {
		this.edus = edus;
	}

	public Expect getExpect() {
		return expect;
	}

	public void setExpect(Expect expect) {
		this.expect = expect;
	}

	public List<Award> getAwards() {
		return awards;
	}

	public void setAwards(List<Award> awards) {
		this.awards = awards;
	}

	public List<WorkExperience> getWorks() {
		return works;
	}

	public void setWorks(List<WorkExperience> works) {
		this.works = works;
	}

	public List<ProjectExperience> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectExperience> projects) {
		this.projects = projects;
	}

	public OtherLanguage getLanguage() {
		return language;
	}

	public void setLanguage(OtherLanguage language) {
		this.language = language;
	}

}
