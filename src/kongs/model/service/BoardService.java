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
		return null;
	}
	
	/**
	 * ��ȸ�� ����6�� ��ȸ�ϱ�
	 * */
	public static List<Board> searchTopClickCount() throws SQLException {
		return null;
	}
	
	/**
	 * �� �Խñ� ��ȸ(��Ͽ��� Ŭ���� ������ ������)
	 * */
	public static Board searchBoard(int boardNum) throws SQLException {
		return null;
	}
	
	/**
	 * �Խñ� ���
	 * */
	public static int insertBoard(Board board) throws SQLException {
		return 0;
	}
	
	/**
	 * �Խñ� ����
	 * */
	public static int updateBoard(Board board) throws SQLException {
		return 0;
	}
	
	/**
	 * �Խñ� ����
	 * */
	public static int deleteBoard(int boardNum) throws SQLException {
		return 0;
	}
	

	/**
	 * ��ȸ�� ������Ʈ
	 * */
	public static int updateClickCount(int boardNum) throws SQLException {
		return 0;
	}
}
