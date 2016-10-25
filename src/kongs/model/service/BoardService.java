package kongs.model.service;

import java.sql.SQLException;
import java.util.List;

import kongs.dao.BoardDAOImpl;
import kongs.model.dto.Board;

public class BoardService {
	private static BoardDAOImpl boardDao = new BoardDAOImpl();
	
	/**
	 * �Խù� ��ü ��ȸ
	 * */
	public static List<Board> searchBoardAll() throws SQLException {
		return boardDao.searchBoardAll();
	}
	
	/**
	 * �оߺ� ��ȸ
	 * */
	public static List<Board> searchByCategory(String category) throws SQLException {
		return boardDao.searchByCategory(category);
	}
	
	/**
	 * ��ȸ�� ����6�� ��ȸ�ϱ�
	 * */
	public static List<Board> searchTopClickCount() throws SQLException {
		return boardDao.searchTopClickCount();
	}
	
	/**
	 * �� �Խñ� ��ȸ(��Ͽ��� Ŭ���� ������ ������)
	 * */
	public static Board searchBoard(int boardNum) throws SQLException {
		return boardDao.searchBoard(boardNum);
	}
	
	/**
	 * �Խñ� ���
	 * */
	public static int insertBoard(Board board) throws SQLException {
		return boardDao.insertBoard(board);
	}
	
	/**
	 * �Խñ� ����
	 * */
	public static int updateBoard(Board board) throws SQLException {
		return boardDao.updateBoard(board);
	}
	
	/**
	 * �Խñ� ����
	 * */
	public static int deleteBoard(int boardNum) throws SQLException {
		return boardDao.deleteBoard(boardNum);
	}
	

	/**
	 * ��ȸ�� ������Ʈ
	 * */
	public static int updateClickCount(int boardNum) throws SQLException {
		return boardDao.updateClickCount(boardNum);
	}
}
