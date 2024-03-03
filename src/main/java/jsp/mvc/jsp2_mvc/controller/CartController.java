package jsp.mvc.jsp2_mvc.controller;

import jsp.mvc.jsp2_mvc.framework.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartController implements Controller {

	@Override
	public void servletRequestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//없는 jsp 요청하므로 404 상태코드 -> error.html 페이지 라우트(web.xml에서 설정)
		RequestDispatcher dispacher = request.getRequestDispatcher("carts.jsp");
		dispacher.forward(request,response);
	}
}
	
	