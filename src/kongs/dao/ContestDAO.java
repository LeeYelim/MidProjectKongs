package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.Contest;

public interface ContestDAO {

	/**
	 * Contest에 있는 전체레코드 조회
	 */
	List<Contest> selectAll() throws SQLException;
	
	/**
	 * Contest에 있는 레코드 중 조회수 높은 4개 추출
	 * */
	List<Contest> selectTopClickCount() throws SQLException;
	
	/**
	 * Contest에 레코드 삽입
	 * 공모전 정보 게시판의 게시글 등록
	 */
	int insert(Contest contest) throws SQLException;
	
	
	/**
	 * Contest에 레코드 수정
	 * 공모전 정보 게시판의 게시글 수정
	 */
	int update(Contest contest) throws SQLException;
	
	
	/**
	 * Contest에 레코드 삭제
	 * 공모전 정보 게시판의 게시글 삭제
	 */
	int delete(String contestNum) throws SQLException;
	
}
