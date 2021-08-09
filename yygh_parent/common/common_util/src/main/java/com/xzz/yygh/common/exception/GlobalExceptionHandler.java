package com.xzz.yygh.common.exception;


import com.xzz.yygh.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail();
    }

    @ExceptionHandler(com.xzz.yygh.common.exception.HospitalException.class)
    @ResponseBody
    public Result error(com.xzz.yygh.common.exception.HospitalException e) {
        e.printStackTrace();
        return Result.fail();
    }
}
