package jsp.mvc.jsp2_mvc.controller;

import jsp.mvc.jsp2_mvc.framework.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher; 

public class CommunityListController  implements Controller {

	@Override
	public void servletRequestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispacher = request.getRequestDispatcher("list.jsp");
		dispacher.forward(request,response);
		
	}

}