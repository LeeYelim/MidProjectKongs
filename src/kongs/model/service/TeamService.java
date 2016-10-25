package kongs.model.service;

import java.sql.SQLException;
import java.util.List;

import kongs.dao.TeamBoardDAO;
import kongs.dao.TeamBoardImpl;
import kongs.model.dto.TeamBoard;

public class TeamService {
	
	private static TeamBoardImpl dao = new TeamBoardImpl();
	
	
	/**
	 * �� �� ���ϱ�
	 * select distinct count(teamid) from member;
	 * */
	public static int searchTeamCount() throws SQLException {
		return dao.searchTeamCount();
	}
	
	/**
	 * ���� ���� ���� Ȯ��
	 */
	public static int searchTeam(String id) throws SQLException {
		return dao.searchTeam(id);
	}
	
	/**
	 * ��ü ���ڵ� �˻�
	 */
	public static List<TeamBoard> selectAll(String teamId) throws SQLException {
		return dao.selectAll(teamId);
	}

	/**
	 * ���ڵ� ����
	 */
	public static int insert(TeamBoard teamBoard) throws SQLException {
		return dao.insert(teamBoard);
	}
	
	/**
	 * �ش� ���ڵ� ����
	 */
	public static int delete(String boardNum, String teamId) throws SQLException {
		return dao.delete(boardNum, teamId);
	}
	
	/**
	 * �ش� ���ڵ� ����
	 */
	public static int update(TeamBoard teamBoard) throws SQLException {
		return dao.update(teamBoard);
	}
}
