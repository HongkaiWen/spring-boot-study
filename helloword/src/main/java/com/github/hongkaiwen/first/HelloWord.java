package com.github.hongkaiwen.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hongkai on 2016/10/19.
 */
@RestController
@EnableAutoConfiguration
public class HelloWord {

    @RequestMapping("/")
    String hello(){
        return "hello world";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWord.class, args);
    }
}
