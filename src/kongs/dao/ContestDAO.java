package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.Contest;

public interface ContestDAO {

	/**
	 * Contest�� �ִ� ��ü���ڵ� ��ȸ
	 */
	List<Contest> selectAll() throws SQLException;
	
	/**
	 * Contest�� �ִ� ���ڵ� �� ��ȸ�� ���� 4�� ����
	 * */
	List<Contest> selectTopClickCount() throws SQLException;
	
	/**
	 * Contest�� ���ڵ� ����
	 * ������ ���� �Խ����� �Խñ� ���
	 */
	int insert(Contest contest) throws SQLException;
	
	
	/**
	 * Contest�� ���ڵ� ����
	 * ������ ���� �Խ����� �Խñ� ����
	 */
	int update(Contest contest) throws SQLException;
	
	
	/**
	 * Contest�� ���ڵ� ����
	 * ������ ���� �Խ����� �Խñ� ����
	 */
	int delete(String contestNum) throws SQLException;
	
}
