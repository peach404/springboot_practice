package me.soyeon.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringpracticeApplication {


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringpracticeApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);

    }
}
