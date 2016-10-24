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
				//list.add(new Contest(rs.getInt(1), title, sponser, category, startDate, endDate, clickCount, regDate, photoName))
			}
			
		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		
		return list;
	}

	
	
	
}



































