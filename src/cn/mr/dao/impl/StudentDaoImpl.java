package cn.mr.dao.impl;

import cn.mr.dao.StudentDao;
import cn.mr.domain.Student;

public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {

	@Override
	public Student getByNumber(String snumber) {
		Student result = null;
		try{
			
			result = session.selectOne("cn.mr.StudentMapper.getByNumber", snumber);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return result;
	}

}
