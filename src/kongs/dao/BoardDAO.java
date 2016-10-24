package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.Board;

public interface BoardDAO {

	/**
	 * �Խù� ��ü ��ȸ
	 * select * from board;
	 * */
	List<Board> searchBoardAll() throws SQLException; 
	
	/**
	 * �оߺ� ��ȸ
	 * select * from board where category=?;
	 * */
	List<Board> searchByCategory(String category) throws SQLException;
	
	/**
	 * ��ȸ�� ����6�� ��ȸ�ϱ�
	 * select top(6) from board order by clickcount desc;
	 * */
	List<Board> searchTopClickCount() throws SQLException;
	
	/**
	 * �� �Խñ� ��ȸ(��Ͽ��� Ŭ���� ������ ������)
	 * select * from board where boardnum=?;
	 * */
	Board searchBoard(int boardNum) throws SQLException;
	
	/**
	 * �Խñ� ���
	 * insert into Board values(, , , , , ,);
	 * */
	int insertBoard(Board board) throws SQLException;
	
	/**
	 * �Խñ� ����
	 * update board set ...... where boardnum=? and category=?;
	 * */
	int updateBoard(Board board) throws SQLException;
	
	/**
	 * �Խñ� ����
	 * delete from board where boardnum=?;
	 * */
	int deleteBoard(int boardNum) throws SQLException;
	

	/**
	 * ��ȸ�� ������Ʈ
	 * update board set clickcount=clickcount+1 where boardnum=?;
	 * */
	int updateClickCount(int boardNum) throws SQLException;
}
