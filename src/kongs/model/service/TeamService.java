package kongs.model.service;

import java.sql.SQLException;
import java.util.List;

import kongs.dao.TeamBoardDAO;
import kongs.dao.TeamBoardImpl;
import kongs.model.dto.TeamBoard;

public class TeamService {
	
	private static TeamBoardImpl dao = new TeamBoardImpl();
	
	/**
	 * 팀 수 구하기
	 * select distinct count(teamid) from member;
	 * */
	public static int searchTeamCount() throws SQLException {
		return dao.searchTeamCount();
	}
	
	/**
	 * 팀의 존재 여부 확인
	 */
	public static int searchTeam(String id) throws SQLException {
		return 0;
	}
	
	/**
	 * 전체 레코드 검색
	 */
	public static List<TeamBoard> selectAll(String teamId) throws SQLException {
		return null;
	}

	/**
	 * 레코드 삽입
	 */
	public static int insert(TeamBoard teamBoard) throws SQLException {
		return 0;
	}
	
	/**
	 * 해당 레코드 삭제
	 */
	public static int delete(String boardNum, String teamId) throws SQLException {
		return 0;
	}
	
	/**
	 * 해당 레코드 수정
	 */
	public static int update(TeamBoard teamBoard) throws SQLException {
		return 0;
	}
}
