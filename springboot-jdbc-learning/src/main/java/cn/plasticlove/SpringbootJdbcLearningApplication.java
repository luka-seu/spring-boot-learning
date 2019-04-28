package cn.plasticlove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan(value = "cn.plasticlove.mapper")
@SpringBootApplication

@EnableCaching
public class SpringbootJdbcLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJdbcLearningApplication.class, args);
    }

}
