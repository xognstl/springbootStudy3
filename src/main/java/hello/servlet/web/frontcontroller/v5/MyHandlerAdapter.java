package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {

    // 핸들러 어뎁터 목록
    boolean supports(Object handler);   // 어뎁터가 해당 컨트롤러를 처리할 수 있는지 판단하는 메서드

    // 핸들러 어뎁터
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws ServletException, IOException;
    // 실제 컨트롤러 호출하고 modelview 반환
}
