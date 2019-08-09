package com.shangcheng.shangcheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShangchengApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShangchengApplication.class, args);
    }

}
