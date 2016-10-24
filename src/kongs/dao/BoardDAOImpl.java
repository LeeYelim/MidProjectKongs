package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.Board;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public List<Board> searchBoardAll() throws SQLException {
		return null;
	}

	@Override
	public List<Board> searchByCategory(String category) throws SQLException {
		return null;
	}

	@Override
	public List<Board> searchTopClickCount() throws SQLException {
		return null;
	}

	@Override
	public Board searchBoard(int boardNum) throws SQLException {
		return null;
	}

	@Override
	public int insertBoard(Board board) throws SQLException {
		return 0;
	}

	@Override
	public int updateBoard(Board board) throws SQLException {
		return 0;
	}

	@Override
	public int deleteBoard(int boardNum) throws SQLException {
		return 0;
	}

	@Override
	public int updateClickCount(int boardNum) throws SQLException {
		return 0;
	}

}
