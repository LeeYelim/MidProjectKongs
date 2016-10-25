package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.TeamBoard;

public interface TeamBoardDAO {
	
	/**
	 * �� �� ���ϱ�
	 * select distinct count(teamid) from member;
	 * */
	int searchTeamCount() throws SQLException;
	
	/**
	 * ���� ���� ���� Ȯ��
	 */
	int searchTeam(String id) throws SQLException;
	
	/**
	 * ��ü ���ڵ� �˻�
	 */
	List<TeamBoard> selectAll(String teamId) throws SQLException;

	/**
	 * ���ڵ� ����
	 */
	int insert(TeamBoard teamBoard) throws SQLException;
	
	/**
	 * �ش� ���ڵ� ����
	 */
	int delete(String boardNum, String teamId) throws SQLException;
	
	/**
	 * �ش� ���ڵ� ����
	 */
	int update(TeamBoard teamBoard) throws SQLException;

	
}
