package kongs.model.service;

import java.sql.SQLException;
import java.util.List;

import kongs.dao.ContestDAOimpl;
import kongs.model.dto.Contest;

public class ContestService {
	private static ContestDAOimpl contestDao = new ContestDAOimpl();
	
	/**
	 * Contest에 있는 전체레코드 조회
	 */
	public static List<Contest> selectAll() throws SQLException {
		return contestDao.selectAll();
	}
	
	
	/**
	 * Contest에 레코드 삽입
	 * 공모전 정보 게시판의 게시글 등록
	 */
	public static int insert(Contest contest) throws SQLException {
		return 0;
	}
	
	
	/**
	 * Contest에 레코드 수정
	 * 공모전 정보 게시판의 게시글 수정
	 */
	public static int update(Contest contest) throws SQLException {
		return 0;
	}
	
	
	/**
	 * Contest에 레코드 삭제
	 * 공모전 정보 게시판의 게시글 삭제
	 */
	public static int delete(String contestNum) throws SQLException {
		return 0;
	}
	
}
