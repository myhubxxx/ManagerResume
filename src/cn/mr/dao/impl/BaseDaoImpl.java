package cn.mr.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import util.SessionFactoryUtils;
import cn.mr.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>  {

	protected SqlSession session = SessionFactoryUtils.getSession();
			
//	private Class<T> clazz;
	
	

	public int add(String sql, T t) throws SQLException {
		int flag = 1;
		try {

			session.insert(sql, t);

		} catch (Exception e) {
			flag = 0;
			e.printStackTrace();
		}
		
		return flag;
	}
	@Deprecated
	public void deleteByOrder(String sql, int order) throws SQLException {
		
		try {

			session.delete(sql, order);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}

	public void deleteById(String sql, String id) throws SQLException {
			
			try {

				session.delete(sql, id);

			} catch (Exception e) {

				e.printStackTrace();
			}
		
	}
	@Deprecated
	public void updateByOrder(String sql, T t) throws SQLException {
		try {

			session.update(sql, t);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}

	

	public void updateById(String sql, T t) throws SQLException {
		try {

			session.update(sql, t);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
	

	public T getById(String sql, String id) throws SQLException {
		T t = null;
		try {
			
			t = (T) session.selectOne(sql, id);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return t;
	}
	@Deprecated
	public T getByOrder(String sql, int order) throws SQLException {
		T t = null;
		try {
			
			t = (T) session.selectOne(sql, order);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return t;
	}

	public Number allCount(String sql, String attrUrl) throws SQLException {
		Number num = null;
		
		try {
			
			num = (Number) session.selectOne(sql, attrUrl);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return num;
	}
	
	public List<T> getCurrentPage(String sql, Map<String, Object> attrMap)
			throws SQLException {
		List<T> list = null;
		
		try {
			
			list = session.selectList(sql, attrMap);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return list;
	}
	



}
