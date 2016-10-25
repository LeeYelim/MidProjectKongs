package kongs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kongs.model.dto.Member;
import kongs.model.service.SignUpService;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "errorView/error.jsp";
		
		try {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pass");
			
			Member member = SignUpService.selectById(id);
			// ��й�ȣ ��ġ���� Ȯ��
			if(pwd.equals(member.getPwd())) { // ��й�ȣ�� ��ġ�ϸ�
				
				request.getSession().setAttribute("user", member);
				url="/index.jsp";
				
			} else { // ��й�ȣ�� ��ġ���� ������
				throw new Exception("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
