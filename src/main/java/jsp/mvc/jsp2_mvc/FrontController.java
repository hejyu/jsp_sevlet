package jsp.mvc.jsp2_mvc;

import jsp.mvc.jsp2_mvc.dto.RequestMapDto;
import jsp.mvc.jsp2_mvc.framework.Controller;
import jsp.mvc.jsp2_mvc.framework.RequestControllerMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "frontController", value = "/")
public class FrontController extends HttpServlet {

    private static  final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(FrontController.class);

    private String message;

    /**
     * 서블릿이 톰캣에서 처음 실행되기 시작할때(메모리에 로드될 때) 자동으로 실행되는 메소드입니다.
     */
    public void init() {
        RequestControllerMapping.init();
    }

    /**
     * get 이나 post 요청에 상관없이 클라이언트의 요청을 처리하는 메소드입니다.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url = request.getServletPath();	// http request servlet path ex) /hello
        String method = request.getMethod();	// http request method
        String contextPath = request.getContextPath();
        String uri = request.getRequestURI();
        StringBuffer reqUrl = request.getRequestURL();

        logger.info("service 메소드 : url - {}, method - {}", url, method);
        logger.info("service 메소드 : contextPath - {}, uri - {}, reqUrl - {}", contextPath, uri, reqUrl);

        RequestMapDto dto = new RequestMapDto(url, method);     // RequestMapDto의 생성자를 사용하여 받은 url과 method가 저장됩니다.

        Controller con = RequestControllerMapping.getController(dto);
        if(con != null) {
            con.servletRequestHandler(request, response);

            logger.info("Controller 객체 - {}", con.getClass());
            logger.info("요청 url 과 method 로 구성된 객체 - {}", dto);
        }

    }

    /**
     * 이 서블릿이 클라이언트 요청을 받으면 doGet 메소드를 실행하지 않고 service 메소드를 실행하는 것을 확인하였다
     * @param request
     * @param response
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String url = request.getServletPath();	// http request servlet path ex)
        String method = request.getMethod();	// http request method

        logger.info("doGet 메소드 : url - {}, method - {}",url,method);


    }

    public void destroy() {
    }
}