package com.lee.config.config;

import com.lee.config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Chill
 * @Date: 2020/5/27 16:22
 * @Configuration当前类是一个配置类
 */

@Configuration
public class MyAppConfig {

    /**
     * @Bean 将方法的返回值添加到容器中,容器中这个组件默认的id就是方法名
     */
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器加组件了");
        return new HelloService();
    }
}
