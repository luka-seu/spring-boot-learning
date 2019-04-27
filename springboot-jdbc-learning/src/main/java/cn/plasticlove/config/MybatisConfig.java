package cn.plasticlove.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;

/**
 * @author luka-seu
 * @description
 * @create 2019-04 27-19:53
 **/
@org.springframework.context.annotation.Configuration
public class MybatisConfig implements ConfigurationCustomizer {
    @Override
    //配置驼峰命名法转换
    public void customize(Configuration configuration) {
        configuration.setMapUnderscoreToCamelCase(true);
    }
}
