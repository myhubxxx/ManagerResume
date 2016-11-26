package Dao;

import java.sql.SQLException;

import org.junit.Test;

import util.SessionFactoryUtils;
import cn.mr.dao.OtherLanguageDao;
import cn.mr.dao.impl.OtherLanguageDaoImpl;
import cn.mr.domain.OtherLanguage;

public class OtherLanguageDaoTest implements DaoTest {

	private OtherLanguageDao dao = new OtherLanguageDaoImpl();
	@Test
	public void add() {
		OtherLanguage o = new OtherLanguage();
			o.setEnglishlevel("四级");
			o.setEnglishscore(710F);
			o.setToefl("10c");
			o.setGre("10c");
			o.setGmat("10c");
			o.setIelts("10c");
			o.setToeic("10c");
			o.setSat("10c");
			o.setOthercontent("日语2级");
			o.setSid("8F195AC4E55E4B68803F2564DA817B2B");
			
		try {
			dao.add("cn.mr.OtherLanguageMapper.insert", o);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactoryUtils.getSession().commit();
	}

	@Test
	public void update() {
		OtherLanguage o = new OtherLanguage();
		o.setEnglishlevel("六级");
		o.setEnglishscore(718F);
		o.setToefl("10c");
		o.setGre("10c");
		o.setGmat("10c");
		o.setIelts("10c");
		o.setToeic("10c");
		o.setSat("10c");
		o.setOthercontent("日语1级");
		o.setSid("04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
//		o.getEnglishlevel();
	try {
		dao.updateById("cn.mr.OtherLanguageMapper.updateById", o);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	SessionFactoryUtils.getSession().commit();
		
	}

	@Test
	public void delete() {
		try {
			dao.deleteById("cn.mr.OtherLanguageMapper.deleteById", "04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA");
			SessionFactoryUtils.getSession().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void get() {
		
		try {
			System.out.println(dao.getById("cn.mr.OtherLanguageMapper.getById", "04BAFA6C6CCD4A2F8A81FDDFC7D0AFEA"));
			System.out.println(dao.getById("cn.mr.OtherLanguageMapper.getById", "8F195AC4E55E4B68803F2564DA817B2B"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
