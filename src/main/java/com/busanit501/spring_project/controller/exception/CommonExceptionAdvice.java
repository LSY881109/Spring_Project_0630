package com.busanit501.spring_project.controller.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {

    // 예외 처리 경우1, 숫자 포맷 예외처리.
    // 리턴값을 뷰가(화면제공이 아니라), 데이터만 전달.
    // HTTP Response body  로 직접 전송.
    @ResponseBody
    // 특정 예외 타입이 발생시, 실행될 메서드에 붙여서,
    // 예외를 파라미터로 받아서, 사용자가 커스텀 처리가 가능.
    @ExceptionHandler(NumberFormatException.class)
    // 서버에서, 데이터만 전달시, 한글 깨지는 문제 해결이 여러가지 있는데, 지금은
    // produce 기능으로 해결, -> ResponseEntity<String> 클래스를 이용할 예정.
    // 방법1, 스프링 4.x 버전 이상인경우라서,
//    @RequestMapping(produces = "text/plain; charset=UTF-8")
    // 방법2, ResponseEntity<String>
//    public String exceptNumber(NumberFormatException numberFormatException) {
    public ResponseEntity<String> exceptNumber(NumberFormatException numberFormatException) {
        log.error("===CommonExceptionAdvice에서, exceptNumber 담당 , 예외1=================");
        log.error(numberFormatException.getMessage());
//        return "number format exception";
//        return "숫자 타입 예외 발생입니다.";
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .contentType(MediaType.valueOf("text/plain; charset=utf-8"))
                .body("숫자 타입 예외 발생입니다");
    }
}
