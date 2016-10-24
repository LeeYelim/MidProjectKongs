package kongs.dao;

import java.sql.SQLException;
import java.util.List;

import kongs.model.dto.Contest;

public interface ContestDAO {

	/**
	 * Contest에 있는 전체레코드 조회
	 */
	List<Contest> selectAll() throws SQLException;
}
