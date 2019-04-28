package cn.plasticlove;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAmqpLearningApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    public void contextLoads() {
        Map<String,Object> map = new HashMap<>();
        map.put("data", Arrays.asList("hello",123,"aaa"));
        rabbitTemplate.convertAndSend("exchange.direct","plasticlove",map);

    }

}
