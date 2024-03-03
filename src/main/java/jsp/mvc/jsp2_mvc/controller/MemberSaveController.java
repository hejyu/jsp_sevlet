package jsp.mvc.jsp2_mvc.controller;

import jsp.mvc.jsp2_mvc.framework.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSaveController implements Controller {

    @Override
    public void servletRequestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String test = request.getParameter("test");

        //POST 요청 처리 후에는 특정 URL 로 리다이렉트 합니다.
        response.sendRedirect("list?test="+test );
    }
}
