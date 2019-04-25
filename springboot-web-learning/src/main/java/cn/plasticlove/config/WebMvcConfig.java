package cn.plasticlove.config;

import cn.plasticlove.component.LoginHandlerInterceptor;
import cn.plasticlove.component.MyLocaleResolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;


/**
 * The type Web mvc config.
 *
 * @author luka -seu
 * @description
 * @create 2019 /4/25-19:33
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    /**
     * set default path mapping
     */
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        //redirect
        registry.addViewController("/main.html").setViewName("Dashboard");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");


    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/index.html").excludePathPatterns("/user/login").
                //springboot2.0会拦截静态资源
                excludePathPatterns("/static/**").excludePathPatterns("/asset/**").excludePathPatterns("/images/**");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }



}
