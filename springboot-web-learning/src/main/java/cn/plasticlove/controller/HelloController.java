package cn.plasticlove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/25-18:40
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Dashboard";
    }
}
