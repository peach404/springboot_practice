package me.soyeon.springpractice;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component //빈등록
public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {

    //ApplicationStartedEvent는 빈등록하고 사용하면 된다.
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("==============================");
        System.out.println("Started");
        System.out.println("==============================");
    }
}
