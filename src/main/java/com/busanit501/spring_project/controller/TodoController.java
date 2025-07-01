package com.busanit501.spring_project.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
// 대표 url,/todo,
// 밑에 메서드 하위  url 주소를 지정함.
// 최종 url, /todo/지정한 주소
@RequestMapping("/todo")
public class TodoController {

    // 최종 url : /todo/list
    @RequestMapping("/list")
    // void 라고하면, 메서드 명 : list
    // /WEB-INF/views/list.jsp , 가리킴.
    // 자동 연결, 뷰 리졸버라는 친구의 업무.
    public void list(){
        log.info("TodoController에서 작업, list 호출 ");
    }

}
