package cn.plasticlove.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/28-14:37
 */

@Configuration
public class KeyGeneratorConfig {

    @Bean("myGenerator")
    public KeyGenerator keyGenerator(){
        return new KeyGenerator(){

            @Override
            public Object generate(Object o, Method method, Object... objects) {
                return method.getName()+"["+ Arrays.asList(objects)+"]";
            }
        };
    }
}
