package cn.plasticlove.controller;

import cn.plasticlove.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luka-seu
 * @description
 * @create 2019-04 26-17:41
 **/
@ControllerAdvice
public class MyExceptionHandler {
//    @ResponseBody
//    @ExceptionHandler(MyException.class)
//    public Map<String,String> handleException(Exception e){
//        Map<String,String> map = new HashMap<>();
//        map.put("code","500");
//        map.put("msg",e.getMessage());
//        return map;
//    }


    @ExceptionHandler(MyException.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        map.put("code","500");
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("message",e.getMessage());
        request.setAttribute("ext",map);
        return "forward:/error";
    }
}
