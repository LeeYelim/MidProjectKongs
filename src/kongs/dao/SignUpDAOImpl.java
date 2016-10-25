package kongs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kongs.model.dto.Member;
import kongs.util.DBUtil;

public class SignUpDAOImpl implements SignUpDAO {

	/**
	 *  ȸ������
	 */
	@Override
	public int insertMember(Member member) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0 ;
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("insert into member(id,pwd,name,nick) values(?,?,?,?)");
			ps.setString(1, member.getId());
			ps.setString(2, member.getPwd());
			ps.setString(3, member.getName());
			ps.setString(4, member.getNick());
			result = ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps, null);
		}
		
		return result;
	}

	
	/**
	 *  ȸ�� Ż��
	 */
	@Override
	public int deleteMember(Member member) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("delete from member where id=?");
			ps.setString(1, member.getId());
			result = ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps, null);
		}
		
		return result;
	}

	
	/**
	 *  ȸ����������
	 */
	@Override
	public int updateMember(Member member) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("update member set pwd=?, name=?, nick=? where id=?");
			ps.setString(1, member.getPwd());
			ps.setString(2, member.getName());
			ps.setString(3, member.getNick());
			ps.setString(4, member.getId());
			result = ps.executeUpdate();
		} finally {
			DBUtil.dbClose(con, ps, null);
		}
		
		return result;
	}

	
	/**
	 *  ��ü ȸ�� ���ڵ� �ҷ�����
	 */
	@Override
	public List<Member> selectAllMember() throws SQLException {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<Member> list = new ArrayList<>();
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select * from member");
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Member(rs.getString("id"), rs.getString("pwd"), rs.getString("name"), rs.getString("nick"), rs.getString("teamId")));
			}
		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		
		return list;
	}

	
	/**
	 *  id�� ȸ������ ��ȸ�ϱ�
	 */
	@Override
	public Member SelectById(String id) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Member member = null;
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement("select * from member where id=?");
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				member =new Member(rs.getString("id"), rs.getString("pwd"), rs.getString("name"), rs.getString("nick"), rs.getString("teamId"));
			}
		} finally {
			DBUtil.dbClose(con, ps, rs);
		}
		
		return member;
	}

}
