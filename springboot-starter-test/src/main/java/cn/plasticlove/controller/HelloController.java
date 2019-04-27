package cn.plasticlove.controller;

import cn.plasticlove.plasticlove.config.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luka-seu
 * @description
 * @create 2019-04 27-22:51
 **/
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/hello")
    public String hello(){
        return helloService.say("plasticlove");
    }
}
