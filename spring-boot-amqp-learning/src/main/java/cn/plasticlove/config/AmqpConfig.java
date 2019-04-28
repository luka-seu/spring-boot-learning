package cn.plasticlove.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author luka-seu
 * @description
 * @create 2019/4/28-17:10
 */

@Configuration
//配置rabbit序列化方式
public class AmqpConfig {


    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }

}
