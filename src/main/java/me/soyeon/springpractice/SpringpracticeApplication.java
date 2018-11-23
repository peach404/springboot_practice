package me.soyeon.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class SpringpracticeApplication {

    public static void main(String[] args) {

        //Application Context가 만들어지기 전에 발생한 이벤트라서 bean으로 등록하지 말고 직접 사용해야한다.
        SpringApplication app = new SpringApplication(SpringApplication.class);
        app.addListeners(new SampleListener());
        app.run(args);

    }
}
