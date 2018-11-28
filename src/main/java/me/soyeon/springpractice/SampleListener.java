package me.soyeon.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component //빈등록
public class SampleListener implements ApplicationRunner {

//    @Value("${soyeon.name}") //properties 값을 출력
//    private String name;

    @Autowired
    Soyeonproperties soyeonproperties;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println("======================");
        System.out.println(soyeonproperties.getName());
        System.out.println(soyeonproperties.getAge());
        System.out.println(soyeonproperties.getPart());
        System.out.println("======================");
    }

}
