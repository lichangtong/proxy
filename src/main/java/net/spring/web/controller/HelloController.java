package net.spring.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/hello")
public class HelloController {
    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello() {
        System.out.println("Say hello everyone！！！");
        return "hello";
    }
}
