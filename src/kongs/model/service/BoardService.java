package kongs.model.service;

import java.sql.SQLException;
import java.util.List;

import kongs.dao.BoardDAOImpl;
import kongs.model.dto.Board;

public class BoardService {
	private static BoardDAOImpl boardDao = new BoardDAOImpl();
	
	/**
	 * 게시물 전체 조회
	 * */
	public static List<Board> searchBoardAll() throws SQLException {
		return boardDao.searchBoardAll();
	}
	
	/**
	 * 분야별 조회
	 * */
	public static List<Board> searchByCategory(String category) throws SQLException {
		return boardDao.searchByCategory(category);
	}
	
	/**
	 * 조회수 상위6개 조회하기
	 * */
	public static List<Board> searchTopClickCount() throws SQLException {
		return boardDao.searchTopClickCount();
	}
	
	/**
	 * 상세 게시글 조회(목록에서 클릭시 나오는 데이터)
	 * */
	public static Board searchBoard(int boardNum) throws SQLException {
		return boardDao.searchBoard(boardNum);
	}
	
	/**
	 * 게시글 등록
	 * */
	public static int insertBoard(Board board) throws SQLException {
		return boardDao.insertBoard(board);
	}
	
	/**
	 * 게시글 수정
	 * */
	public static int updateBoard(Board board) throws SQLException {
		return boardDao.updateBoard(board);
	}
	
	/**
	 * 게시글 삭제
	 * */
	public static int deleteBoard(int boardNum) throws SQLException {
		return boardDao.deleteBoard(boardNum);
	}
	

	/**
	 * 조회수 업데이트
	 * */
	public static int updateClickCount(int boardNum) throws SQLException {
		return boardDao.updateClickCount(boardNum);
	}
}
