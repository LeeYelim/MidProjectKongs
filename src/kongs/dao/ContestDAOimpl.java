package kongs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kongs.model.dto.Contest;
import kongs.util.DBUtil;

public class ContestDAOimpl implements ContestDAO {

	/**
	 * Contest에 있는 전체레코드 조회
	 */
	@Override
	public List<Contest> selectAll() throws SQLException {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<Contest> list = new ArrayList<>();
		
		try {
			
			con  = DBUtil.getConnection();
			ps = con.prepareStatement("select * from contest");
			rs =ps.executeQuery();
			while(rs.next()) {
				list.add(new Contest(rs.getInt("contestnum"), rs.getString("title"), rs.getString("sponser"), 
						rs.getString("category"), rs.getString("startDay"), rs.getString("endDay"), 
						rs.getInt("clickCount"), rs.getString("regDate"), rs.getString("photoName")));
			}
		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		
		return list;
	}

	
	/**
	 * Contest에 레코드 삽입
	 * 공모전 정보 등록
	 */
	@Override
	public int insert(Contest contest) throws SQLException {
		
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
	
			con = DBUtil.getConnection();
			ps = con.prepareStatement("insert into contest(title,sponser,startday,endday,photoname,clickcount,category,regdate,contestnum) "
					+ "values(?,?,?,?,?,?,?,sysdate,seq_contestBoard.nextval)");
			ps.setString(1, contest.getTitle());
			ps.setString(2, contest.getSponser());
			ps.setString(3, contest.getStartDate());
			ps.setString(4, contest.getEndDate());
			ps.setString(5, contest.getPhotoName());
			ps.setInt(6, contest.getClickCount());
			ps.setString(7, contest.getCategory());
			result = ps.executeUpdate();
	
		} finally {
			DBUtil.dbClose(con, ps, null);
		}
		
		return result;
	}

	
	/**
	 * Contest에 레코드 수정
	 * 공모전 정보 수정
	 */
	@Override
	public int update(Contest contest) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try{
			
			con = DBUtil.getConnection();
			ps = con.prepareStatement("update contest set sponser=?,startday=?,endday=?,photonum=?, category=? where contestnum=?");
			ps.setString(1, contest.getSponser());
			ps.setString(2, contest.getStartDate());
			ps.setString(3, contest.getEndDate());
			ps.setString(4, contest.getPhotoName());
			ps.setString(5, contest.getCategory());
			ps.setInt(6, contest.getNum());
			result = ps.executeUpdate();
			
		} finally {
			DBUtil.dbClose(con, ps, null);
		}
		
		return result;
	}


	/**
	 * Contest에 레코드 삭제
	 * 공모전 정보 게시판의 게시글 삭제
	 */
	@Override
	public int delete(String contestNum) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			
			con = DBUtil.getConnection();
			ps = con.prepareStatement("delete from contest where contestnum=?");
			ps.setInt(1, Integer.parseInt(contestNum));
			result = ps.executeUpdate();
			
		} finally {
			DBUtil.dbClose(con, ps, null);
		}
		
		return result;
	}

	
	
	
}



































