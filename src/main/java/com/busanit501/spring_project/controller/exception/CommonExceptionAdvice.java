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
    @ResponseBody
    @ExceptionHandler(NumberFormatException.class)
    public String exceptNumber(NumberFormatException numberFormatException) {
        log.error("===CommonExceptionAdvice에서, exceptNumber 담당 , 예외1=================");
        log.error(numberFormatException.getMessage());
        return "숫자 포맷 형식의 예외 발생입니다.";
    }
}
