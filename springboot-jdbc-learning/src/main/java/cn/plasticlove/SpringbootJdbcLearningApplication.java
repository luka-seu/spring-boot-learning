package cn.plasticlove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "cn.plasticlove.mapper")
@SpringBootApplication
public class SpringbootJdbcLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJdbcLearningApplication.class, args);
    }

}
