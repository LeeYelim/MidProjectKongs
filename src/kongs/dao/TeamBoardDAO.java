package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.TeamBoard;

public interface TeamBoardDAO {

	/**
	 * ��ü ���ڵ� �˻�
	 */
	List<TeamBoard> selectAll() throws SQLException;
	
	

	/**
	 * ���ڵ� ����
	 */
	int insert(TeamBoard teamBoard) throws SQLException;
	
	
	/**
	 * �ش� ���ڵ� ����
	 */
	int delete(String boardNum) throws SQLException;

	
	/**
	 * �ش� ���ڵ� ����
	 */
	int update(TeamBoard teamBoard) throws SQLException;
	
	
	
}
