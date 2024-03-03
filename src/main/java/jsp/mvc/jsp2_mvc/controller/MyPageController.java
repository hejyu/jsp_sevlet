package jsp.mvc.jsp2_mvc.controller;

import jsp.mvc.jsp2_mvc.framework.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyPageController implements Controller {

	@Override
	public void servletRequestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispacher = request.getRequestDispatcher("mypage.jsp");
		dispacher.forward(request,response);
	}
}