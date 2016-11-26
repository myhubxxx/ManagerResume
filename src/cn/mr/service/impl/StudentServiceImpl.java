package cn.mr.service.impl;

import util.BeanFactory;
import cn.mr.dao.StudentDao;
import cn.mr.domain.Student;
import cn.mr.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao dao = (StudentDao) BeanFactory.get("StudentDao");
	
	@Override
	public Student getByNumber(String snumber) {
		Student result = null; 
		try{
			
			result = dao.getByNumber(snumber);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}

}
