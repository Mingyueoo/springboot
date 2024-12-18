package com.ming.boot.config;

import com.ming.boot.bean.Car;
import com.ming.boot.bean.Cat;
import com.ming.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@EnableConfigurationProperties(Car.class)
//@ConditionalOnBean(name="tom")//有tom,User01才生效
@ConditionalOnMissingBean(name = "tom")
@Import({User.class})
@Configuration(proxyBeanMethods = false)//单例模式，一般都是false
public class MyConfig {

    @Bean
    public User user01() {
        return new User("zhangsan", 18);
    }
    @Bean("tom22")//返回bean的方法名
    public Cat tomcat(){
        return new Cat("tomcat");
    }
}
