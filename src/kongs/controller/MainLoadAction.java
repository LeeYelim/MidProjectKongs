package kongs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kongs.model.dto.Contest;
import kongs.model.service.ContestService;
import kongs.model.service.SignUpService;
import kongs.model.service.TeamService;

public class MainLoadAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="errorView/error.jsp";
		
		try{
			// ��ü ������ ��
			int size = ContestService.selectAll().size();
			request.setAttribute("size", size);
		 
			// ��ü �� ��
			int teamcount = TeamService.searchTeamCount();
			request.setAttribute("teamcount", teamcount);
			
			// ��ȸ�� ���� 4�� ������
			List<Contest> list  = ContestService.selectTopClickCount();
			request.setAttribute("list", list);
			
			// ȸ����
			int membercount = SignUpService.selectAllMember().size();
			request.setAttribute("membercount", membercount);
			url="/main.jsp";
		} catch(SQLException e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
