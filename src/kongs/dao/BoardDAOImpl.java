package kongs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kongs.model.dto.Board;
import kongs.util.DBUtil;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public List<Board> searchBoardAll() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Board> list = new ArrayList<>();
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select * from board");
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Board(rs.getInt("boardNum"), rs.getString("category"), 
						rs.getString("title"), rs.getString("contents"), rs.getString("writer"), 
						rs.getString("regDate"), rs.getInt("clickCount"), rs.getString("fileName")));
			}
		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return list;
	}

	@Override
	public List<Board> searchByCategory(String category) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Board> list = new ArrayList<>();
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select * from board where category=?");
			ps.setString(1, category);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Board(rs.getInt("boardNum"), rs.getString("category"), 
						rs.getString("title"), rs.getString("contents"), rs.getString("writer"), 
						rs.getString("regDate"), rs.getInt("clickCount"), rs.getString("fileName")));
			}
		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return list;
	}

	@Override
	public List<Board> searchTopClickCount() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Board> list = new ArrayList<>();
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select top(6) from board order by clickcount desc");
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Board(rs.getInt("boardNum"), rs.getString("category"), 
						rs.getString("title"), rs.getString("contents"), rs.getString("writer"), 
						rs.getString("regDate"), rs.getInt("clickCount"), rs.getString("fileName")));
			}
		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return list;
	}

	@Override
	public Board searchBoard(int boardNum) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Board board = null;
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select * from board where boardnum=?");
			ps.setInt(1, boardNum);
			rs = ps.executeQuery();
			while(rs.next()) {
				board = new Board(rs.getInt("boardNum"), rs.getString("category"), rs.getString("title"), rs.getString("contents"), rs.getString("writer"), 
						rs.getString("regDate"), rs.getInt("clickCount"), rs.getString("fileName"));
			}
		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return board;
	}

	@Override
	public int insertBoard(Board board) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql="";
		try{
			con = DBUtil.getConnection();
			if(board.getCategory().equals("free")) {
				sql = "insert into Board values(?, sysdate, ?, 0, ?, ?, seq_freeBoard.nextval, ?)";
			} else if(board.getCategory().equals("find")) {
				sql = "insert into Board values(?, sysdate, ?, 0, ?, ?, seq_findBoard.nextval, ?)";
			}
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getWriter());
			ps.setString(2, board.getTitle());
			ps.setString(3, board.getContents());
			ps.setString(4, board.getFileName());
			ps.setString(5, board.getCategory());
			result = ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps, null);
		}
		return result;
	}

	@Override
	public int updateBoard(Board board) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement("update board ftitle=?, contents=?, filename=? where boardnum=? and category=?");
			ps.setString(1, board.getTitle());
			ps.setString(2, board.getContents());
			ps.setString(3, board.getFileName());
			ps.setInt(4, board.getBoardNum());
			ps.setString(5, board.getCategory());
			result = ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps, null);
		}
		return result;
	}

	@Override
	public int deleteBoard(int boardNum) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement("delete from board where boardnum=?");
			ps.setInt(1, boardNum);
			result = ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps, null);
		}
		return result;
	}

	@Override
	public int updateClickCount(int boardNum) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement("update board set clickcount=clickcount+1 where boardnum=?");
			ps.setInt(1, boardNum);
			result = ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps, null);
		}
		return result;
	}

}
