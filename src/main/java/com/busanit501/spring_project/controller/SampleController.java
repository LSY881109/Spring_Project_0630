package com.busanit501.spring_project.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

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

    // 단순 파라미터 자동수집
    @GetMapping("ex1")
    // 기본 자료형으로 정의했고,
    // 화면에서 , 쿼리스트링 형식으로 , get 방식으로
    // 데이터 전달
    // http://localhost:8080/ex1?name=lsy&age=20
    public void ex1(String name, int age){
        log.info("SampleController 작업중. ex1");
        log.info("name:"+name+",age:"+age);
    }

    @GetMapping("/ex2")
    public void ex2(@RequestParam(name = "name", defaultValue = "사용자") String name,
                    @RequestParam(name = "age", defaultValue = "20") int age) {
        log.info("SampleController 작업중. ex2, 값이 없는 경우, 기본값 이용");
        log.info("name:"+name+",age:"+age);
    }

    // 날짜 포맷터 인경우.
    // http://localhost:8080/ex3?dueDate=2025-07-01
    // 화면에서 전달 된 파라미터 쿼리스트링은 무조건 문자열
    // 서버에서 받을 때 LocalDate 형 일치가 안된다.
    // 그래서, 서버에서 시작시, 형 변환을 자동으로 해주겠다.
    @GetMapping("/ex3")
    public void ex3(LocalDate dueDate) {
        log.info("SampleController 작업중. ex3, 날짜 포맷터 형식인 경우");
        log.info("dueDate:"+dueDate);
    }

}
