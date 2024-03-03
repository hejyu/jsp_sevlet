package jsp.mvc.jsp2_mvc.controller;

import jsp.mvc.jsp2_mvc.dao.MybatisMemberDao;
import jsp.mvc.jsp2_mvc.dao.MybatisProductDao;
import jsp.mvc.jsp2_mvc.dto.CustomerDto;
import jsp.mvc.jsp2_mvc.dto.ProductDto;
import jsp.mvc.jsp2_mvc.framework.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductAddController implements Controller {

	private static final Logger logger = LoggerFactory.getLogger(ProductAddController.class);

	@Override
	public void servletRequestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");	// 쿼리 파라미터를 받아오기 전에 한글 인코딩을 설정합니다
		String method = request.getMethod();

		if(method.equals("GET")){
			RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
			rd.forward(request,response);
		}else if(method.equals("POST")){
			MybatisProductDao dao = new MybatisProductDao();

			String p_code = request.getParameter("p_code");
			String category = request.getParameter("category");
			String p_name = request.getParameter("p_name");
			int price = Integer.parseInt(request.getParameter("price"));

			int count = dao.insert(new ProductDto(p_code,category,p_name,price));

			// POST 요청 처리 후에는 회원 목록 url 로 리다이렉트 합니다.
			response.sendRedirect("list");

			logger.info("[상품 등록] 반영 개수 : {} 건 ", count);

		}

	}
}
	
	