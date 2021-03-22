package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Iron
 * @Date: 2021/03/22/15:23
 * @Description:
 */
@RestController
@RequestMapping
public class HelloController {
    @GetMapping("/hello")
    String hello(){
        return "hello i am ironMan !!!";
    }
}
