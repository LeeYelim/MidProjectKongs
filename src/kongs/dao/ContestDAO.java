package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.Contest;

public interface ContestDAO {

	/**
	 * Contest�� �ִ� ��ü���ڵ� ��ȸ
	 */
	List<Contest> selectAll() throws SQLException;
}
