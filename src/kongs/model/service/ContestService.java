package kongs.model.service;

import java.sql.SQLException;
import java.util.List;

import kongs.dao.ContestDAOimpl;
import kongs.model.dto.Contest;

public class ContestService {
	private static ContestDAOimpl contestDao = new ContestDAOimpl();
	
	/**
	 * Contest�� �ִ� ��ü���ڵ� ��ȸ
	 */
	public static List<Contest> selectAll() throws SQLException {
		return contestDao.selectAll();
	}
	
	
	/**
	 * Contest�� ���ڵ� ����
	 * ������ ���� �Խ����� �Խñ� ���
	 */
	public static int insert(Contest contest) throws SQLException {
		return 0;
	}
	
	
	/**
	 * Contest�� ���ڵ� ����
	 * ������ ���� �Խ����� �Խñ� ����
	 */
	public static int update(Contest contest) throws SQLException {
		return 0;
	}
	
	
	/**
	 * Contest�� ���ڵ� ����
	 * ������ ���� �Խ����� �Խñ� ����
	 */
	public static int delete(String contestNum) throws SQLException {
		return 0;
	}
	
}
