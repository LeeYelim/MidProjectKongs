package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.Member;

public interface SignUpDAO {
	
	/**
	 *  ȸ������
	 */
	int insertMember(Member member) throws SQLException;
	
	
	/**
	 *  ȸ��Ż��
	 */
	int deleteMember(String id) throws SQLException;
	
	
	/**
	 *  ȸ�� ���� ����
	 */
	int updateMember(Member member) throws SQLException;

	
	/**
	 *  ��ü ȸ�� ���� �ҷ�����
	 */
	List<Member> selectAllMember() throws SQLException;
	
	
	/**
	 *  id�� ȸ�� ���� ��������
	 */
	Member SelectById(String id) throws SQLException;


}
