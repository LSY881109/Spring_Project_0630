package com.busanit501.spring_project.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {
    // 1)화면 제공, 2) 로직처리
    @GetMapping("/hello")
//    반환형이 void인 경우, 요청 URL을 기준으로 
//    JSP 페이지 이름 자동 매칭
    // /WEB-INF/views/hello.jsp
    // public void hello() , 동일 이름으로 화면 호출
    public void hello() {
        log.info("hello.......");
    }

}
