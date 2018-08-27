package com.point.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class BaseController {

    @RequestMapping("/hello")
    public void hello(String name){
        System.out.println("--->>> hello"+name);
    }
}
