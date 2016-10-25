package kongs.model.service;

import java.sql.SQLException;

import kongs.dao.SignUpDAO;
import kongs.dao.SignUpDAOImpl;
import kongs.model.dto.Member;

public class SignUpService {
	private static SignUpDAO signupDao = new SignUpDAOImpl();
	
	/**
	 *  ȸ������
	 */
	public static int signUp(Member member) throws SQLException {
		return signupDao.insertMember(member);
	}
	
	
	/**
	 * ȸ����ȸ(��й�ȣȮ��)
	 */
	public static String searchPwdById(String id) throws SQLException {		
		return signupDao.SelectById(id).getPwd();
	}
	
	
	/**
	 * ȸ����ȸ(ID�ߺ�Ȯ��)
	 */
	public static Member selectById(String id) throws SQLException {
		return signupDao.SelectById(id);
	}
}