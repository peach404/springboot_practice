package me.soyeon.springpractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component //빈등록
public class SampleRunner implements ApplicationRunner {


    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    @Autowired
    private String hello;

    @Autowired
    private Soyeonproperties soyeonproperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("=========================");
        logger.debug(soyeonproperties.getName());
        logger.debug(soyeonproperties.getPart());
        logger.debug("=========================");

        //properties에 적은 사항
        //logging.path=logs
        // logging.level.me.soyeon=debug


        System.out.println("======================");
        System.out.println(hello);
        System.out.println("======================");
    }

}
