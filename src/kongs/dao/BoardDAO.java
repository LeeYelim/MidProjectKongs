package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.Board;

public interface BoardDAO {

	/**
	 * 게시물 전체 조회
	 * select * from board;
	 * */
	List<Board> searchBoardAll() throws SQLException; 
	
	/**
	 * 분야별 조회
	 * select * from board where category=?;
	 * */
	List<Board> searchByCategory(String category) throws SQLException;
	
	/**
	 * 조회수 상위6개 조회하기
	 * select top(6) from board order by clickcount desc;
	 * */
	List<Board> searchTopClickCount() throws SQLException;
	
	/**
	 * 상세 게시글 조회(목록에서 클릭시 나오는 데이터)
	 * select * from board where boardnum=?;
	 * */
	Board searchBoard(int boardNum) throws SQLException;
	
	/**
	 * 게시글 등록
	 * insert into Board values(, , , , , ,);
	 * */
	int insertBoard(Board board) throws SQLException;
	
	/**
	 * 게시글 수정
	 * update board set ...... where boardnum=? and category=?;
	 * */
	int updateBoard(Board board) throws SQLException;
	
	/**
	 * 게시글 삭제
	 * delete from board where boardnum=?;
	 * */
	int deleteBoard(int boardNum) throws SQLException;
	

	/**
	 * 조회수 업데이트
	 * update board set clickcount=clickcount+1 where boardnum=?;
	 * */
	int updateClickCount(int boardNum) throws SQLException;
}
