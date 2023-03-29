package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
* @Controller 자동으로 스프링 빈으로 등록
* @RequestMapping 요청 정보 매핑, url이 호출되면 메서드 실행
* ModelAndView 모델, 뷰 정보를 담아서 반환
* */
@Controller
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
//파이팅