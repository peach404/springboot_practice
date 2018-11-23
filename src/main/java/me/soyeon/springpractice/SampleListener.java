package me.soyeon.springpractice;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;


@Component //빈등록
public class SampleListener {

    public SampleListener(ApplicationArguments arguments){
        //Vm option은 안읽힘
        System.out.println("foo: " + arguments.containsOption("foo"));
        //Program arguments는 읽힘
        System.out.println("bar: " + arguments.containsOption("bar"));
    }

}
