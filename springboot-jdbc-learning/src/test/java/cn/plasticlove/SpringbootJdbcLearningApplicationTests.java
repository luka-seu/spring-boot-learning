package cn.plasticlove;

import cn.plasticlove.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJdbcLearningApplicationTests {


    @Autowired
    DataSource dataSource;

    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    EmployeeMapper employeeMapper;


    @Test
    public void contextLoads() {
        System.out.println(dataSource.getClass());
        Connection connection = null;
        try {
            connection = dataSource.getConnection();

            System.out.println(connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void RedisTest(){
        // stringRedisTemplate.opsForValue().append("msg","hello redis");

        redisTemplate.opsForValue().set("object1",employeeMapper.getEmpById(1));
    }


}
