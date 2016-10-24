package kongs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kongs.model.dto.TeamBoard;
import kongs.util.DBUtil;

public class TeamBoardImpl implements TeamBoardDAO {

	/**
	 * 팀의 존재 여부 확인
	 */
	@Override
	public int searchTeam(String id) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int result = 0;
		String sql = "select teamid from team where id = ?";
		
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()){
				result = 1;
			}else{
				result = 0;
			}
		}finally{
			DBUtil.dbClose(con, ps, rs);
		}
		return result;
	}
	
	/**
	 * 전체 레코드 검색
	 */
	@Override
	public List<TeamBoard> selectAll(String teamId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<TeamBoard> list = new ArrayList<>();
		String sql = "select * from TeamBoard where teamId=?";
		
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, teamId);
			rs = ps.executeQuery();
			
			while(rs.next()){
				TeamBoard tb = new TeamBoard(
						rs.getString("teamId"),
						rs.getInt("boardNum"),
						rs.getString("category"),
						rs.getString("title"),
						rs.getString("contents"),
						rs.getString("writer"),
						rs.getString("regDate"),
						rs.getInt("clickCount"),
						rs.getString("fileName"));
				list.add(tb);
			}
		}finally {
			DBUtil.dbClose(con, ps, rs);
		}
		return list;
	}

	/**
	 * 레코드 삽입
	 */
	@Override
	public int insert(TeamBoard teamBoard) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into TeamBoard value(?,?,?,?,?,?,?,?,?)";
		
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, teamBoard.getTeamId());
			ps.setInt(2, teamBoard.getBoardNum());
			ps.setString(3, teamBoard.getCategory());
			ps.setString(4, teamBoard.getTitle());
			ps.setString(5, teamBoard.getContents());
			ps.setString(6, teamBoard.getWriter());
			ps.setString(7, teamBoard.getRegDate());
			ps.setInt(8, teamBoard.getClickCount());
			ps.setString(9, teamBoard.getFileName());
			
			result = ps.executeUpdate();
			
		}finally {
			DBUtil.dbClose(con, ps, null);
		}
		return result;
	}

	/**
	 * 해당 레코드 삭제
	 */
	@Override
	public int delete(String boardNum,String teamId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "delete from TeamBoard where boardNum = ? and teamId=?";
		
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, boardNum);
			ps.setString(2, teamId);
			result = ps.executeUpdate();
			
		}finally {
			DBUtil.dbClose(con, ps, null);
		}
		return result;
	}

	/**
	 * 해당 레코드 수정
	 */
	@Override
	public int update(TeamBoard teamBoard) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "update TeamBoard set writer =?, title=?, contents=?, fileName=? where teamId=?";
		
		try{
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, teamBoard.getWriter());
			ps.setString(2, teamBoard.getTitle());
			ps.setString(3, teamBoard.getContents());
			ps.setString(4, teamBoard.getFileName());
			ps.setString(5, teamBoard.getTeamId());
			result = ps.executeUpdate();
			
		}finally {
			DBUtil.dbClose(con, ps, null);
		}
		return result;
	}


}
