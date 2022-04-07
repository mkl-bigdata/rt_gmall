package com.example.gamll_logger.spring_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {

    @RequestMapping("test")
    public String test1(){

        System.out.println("successdd");

        return "success.html";

    }

}
