package kongs.model.service;

import java.sql.SQLException;
import java.util.List;
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
	 *  ��ü ȸ�� ���� �ҷ�����
	 */
	public static List<Member> selectAllMember() throws SQLException {
		return signupDao.selectAllMember();
	}
	
	
	/**
	 * ȸ����ȸ(ID�ߺ�Ȯ��)
	 */
	public static Member selectById(String id) throws SQLException {
		return signupDao.SelectById(id);
	}
	
	
	/**
	 * ȸ��Ż��
	 */
	public static int withdrawal(String id) throws SQLException {
		return signupDao.deleteMember(id);
	}
	
	/**
	 * ȸ����������
	 */
	public static int updateMember(Member member) throws SQLException {
		return signupDao.updateMember(member);
	}
	
	
}
