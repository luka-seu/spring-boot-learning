package cn.plasticlove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/25-20:55
 */

@Controller
public class LoginController {

    @PostMapping("user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password){

        if (!StringUtils.isEmpty(username)&&"123456".equals(password)){
            return "redirect:/main.html";
        }else{
            return "login";
        }

    }
}
