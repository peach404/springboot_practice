package me.soyeon.springpractice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//스프링 관련 설정파일 추가

@Configuration
public class WebConfig implements WebMvcConfigurer {


    //localhost:8080/m/hello.html
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("m/**")
                .addResourceLocations("classpath:/m/")
                .setCachePeriod(20);
    }

}
