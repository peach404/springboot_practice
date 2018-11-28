package me.soyeon.springpractice.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")  //prod 라는 profile일때 빈이 설정 및 사용이 된다
@Configuration
public class BaseConfiguration {

    @Bean
    public String hello(){
        return "Hello";
    }
}

