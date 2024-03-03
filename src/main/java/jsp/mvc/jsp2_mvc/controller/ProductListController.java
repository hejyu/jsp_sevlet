package jsp.mvc.jsp2_mvc.controller;

import jsp.mvc.jsp2_mvc.dao.MybatisProductDao;
import jsp.mvc.jsp2_mvc.dto.CateDto;
import jsp.mvc.jsp2_mvc.dto.ProductDto;
import jsp.mvc.jsp2_mvc.framework.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductListController implements Controller {

	private static final Logger logger = LoggerFactory.getLogger(ProductListController.class);

	@Override
	public void servletRequestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MybatisProductDao dao = new MybatisProductDao();

		String category = request.getParameter("category");
		String keyword = request.getParameter("keyword");
		String from = request.getParameter("from");
		String to = request.getParameter("to");

		Map<String,Object> param = new HashMap<>();

		if(category !=null && category.trim().length() != 0) {
			param.put("category", category);
			request.setAttribute("cate", category);
		}

		if(keyword !=null && !keyword.isEmpty()) {
			param.put("keyword", keyword.trim());
			request.setAttribute("keyword", keyword);
		}

		if((from !=null && !from.isEmpty())
				&& (to !=null && !to.isEmpty())) {
			param.put("from", from.trim());
			param.put("to", to.trim());
		}


		List<ProductDto> list = dao.search(param);
		List<CateDto> cate_list = dao.getCategories();

		request.setAttribute("list",list);
		request.setAttribute("cate_list",cate_list);

		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request,response);

		logger.info("[상품 목록] : {}  ", list);
		logger.info("[상품 카테고리] {}", cate_list);
		logger.info("[Product 검색] 쿼리 파라미터 category={},keyword={},from={},to={}" , category, keyword, from, to);
		logger.info("[Product 검색 저장 map] param = {}" , param);

	}

}