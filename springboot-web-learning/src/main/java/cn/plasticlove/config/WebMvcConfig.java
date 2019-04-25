package cn.plasticlove.config;

import cn.plasticlove.component.MyLocaleResolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


/**
 * The type Web mvc config.
 *
 * @author luka -seu
 * @description
 * @create 2019 /4/25-19:33
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

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
        //parse the static resources (js/css/images)
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        // registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/");
        // super.addResourceHandlers(registry);
    }




    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }



}
