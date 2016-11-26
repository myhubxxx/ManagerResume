package cn.mr.dao;

import cn.mr.domain.Student;

public interface StudentDao extends BaseDao<Student>{

	Student getByNumber(String snumber);

}
