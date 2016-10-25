package kongs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kongs.model.dto.Member;
import kongs.model.service.SignUpService;

/**
 *  ȸ������
 */
public class SignUpAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "errorView/error.jsp";
		
		try {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pass");
			String name = request.getParameter("name");
			String nick = request.getParameter("nick");
			
			Member member = new Member(id,pwd,name,nick);
			
			int result = SignUpService.signUp(member);
			if(result==0) {
				throw new Exception("ȸ�����Կ� �����Ͽ����ϴ�.");
			} else {	// ȸ�����Կ� ����
				// ���� ������ �α��� ���� ����
				// ������������ �̵�(�α��λ��·�) => loginAction���� �����ֱ�
				request.getSession().setAttribute("user", member);
				url="/index.jsp";
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
