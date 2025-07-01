package com.busanit501.spring_project.controller.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
    public String exceptNumber(NumberFormatException numberFormatException) {
        log.error("===CommonExceptionAdvice에서, exceptNumber 담당 , 예외1=================");
        log.error(numberFormatException.getMessage());
        return "number format exception";
    }
}
