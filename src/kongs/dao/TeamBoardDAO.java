package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.TeamBoard;

public interface TeamBoardDAO {

	/**
	 * 전체 레코드 검색
	 */
	List<TeamBoard> selectAll() throws SQLException;
	
	

	/**
	 * 레코드 삽입
	 */
	int insert(TeamBoard teamBoard) throws SQLException;
	
	
	/**
	 * 해당 레코드 삭제
	 */
	int delete(String boardNum) throws SQLException;

	
	/**
	 * 해당 레코드 수정
	 */
	int update(TeamBoard teamBoard) throws SQLException;
	
	
	
}
