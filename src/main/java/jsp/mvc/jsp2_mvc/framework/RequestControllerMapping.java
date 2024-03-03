package jsp.mvc.jsp2_mvc.framework;

import jsp.mvc.jsp2_mvc.controller.*;
import jsp.mvc.jsp2_mvc.dto.RequestMapDto;

import java.util.HashMap;
import java.util.Map;

/**
 * key는 url과 method로 구성된 RequestMap 객체이고, value는 연결되는 Controller입니다.
 */
public class RequestControllerMapping {

    private  static final Map<RequestMapDto, Controller> mapping = new HashMap<>();

    /**
     * 개발자가 작성한 메소드입니다. 메소드의 이름은 init이 아니어도 됩니다.
     */
    public static void init() {
        mapping.put(new RequestMapDto("/member/join","GET"), new MemberJoinController());
        mapping.put(new RequestMapDto("/member/join","POST"), new MemberJoinController());
        mapping.put(new RequestMapDto("/member/list","GET"), new MemberListController());
        mapping.put(new RequestMapDto("/product/list","GET"), new ProductListController());
        mapping.put(new RequestMapDto("/product/add","GET"), new ProductAddController());
        mapping.put(new RequestMapDto("/product/add","POST"), new ProductAddController());
        mapping.put(new RequestMapDto("/member/modify","GET"), new MemberModifyController());
        mapping.put(new RequestMapDto("/member/save","POST"), new MemberSaveController());
        mapping.put(new RequestMapDto("/community/list","GET"), new CommunityListController());
        mapping.put(new RequestMapDto("/community/write","GET"), new CommunityWriteController());
        mapping.put(new RequestMapDto("/myPage","GET"), new MyPageController());
        mapping.put(new RequestMapDto("/login","GET"), new LoginController());
        mapping.put(new RequestMapDto("/cart/list","GET"), new CartController());
        mapping.put(new RequestMapDto("/product/list","GET"), new ProductListController());
    }

    /**
     * url과 method 로 구성된 dto를 인자로 받아 맵핑된 컨트롤러를 리턴해주는 메소드입니다
     * @param key
     * @return
     */
    public static Controller getController(RequestMapDto key){
        return mapping.get(key);
    }



    
}
