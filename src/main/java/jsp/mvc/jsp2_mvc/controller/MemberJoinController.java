package jsp.mvc.jsp2_mvc.controller;

import jsp.mvc.jsp2_mvc.FrontController;
import jsp.mvc.jsp2_mvc.dao.MybatisMemberDao;
import jsp.mvc.jsp2_mvc.dto.CustomerDto;
import jsp.mvc.jsp2_mvc.framework.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher; 

public class MemberJoinController  implements Controller {

	private static final Logger logger = LoggerFactory.getLogger(MemberJoinController.class);

	@Override
	public void servletRequestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");	// 쿼리 파라미터를 받아오기 전에 한글 인코딩을 설정합니다
		String method = request.getMethod();

		if(method.equals("GET")) {
			RequestDispatcher dispacher = request.getRequestDispatcher("join.jsp");
			dispacher.forward(request,response);
		} else if(method.equals("POST")) {
			MybatisMemberDao dao = new MybatisMemberDao();

			String custom_id = request.getParameter("custom_id");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			int age = Integer.parseInt(request.getParameter("age"));
			int count = dao.insert(new CustomerDto(custom_id,name,email,age,null));

			// POST 요청 처리 후에는 회원 목록 url 로 리다이렉트 합니다.
			response.sendRedirect("list");

			logger.info("[회원 등록] 반영 개수 : {} 건 ", count);
		}

	}
}
	
	