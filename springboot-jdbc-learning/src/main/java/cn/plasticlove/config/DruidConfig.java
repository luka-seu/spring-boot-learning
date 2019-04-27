package cn.plasticlove.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewFilter;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luka-seu
 * @description
 * @create 2019-04 27-12:38
 **/
@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean  bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String,String> initMap = new HashMap<>();
        initMap.put("loginUsername","admin");
        initMap.put("loginPassword","admin");
        initMap.put("allow","");
        bean.setInitParameters(initMap);
        return bean;
    }
    @Bean
    public FilterRegistrationBean webstatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        Map<String,String> initMap = new HashMap<>();

        initMap.put("exclusions","*.js,*.css,/druid/*");

        bean.setFilter(new WebStatFilter());

        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
