package com.github.hongkaiwen.springboot.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hongkai on 2016/10/19.
 */
@RestController
public class HelloWord {

    @RequestMapping("/")
    String hello(){
        return "hello world";
    }
}
