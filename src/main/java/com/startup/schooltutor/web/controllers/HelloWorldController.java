package com.startup.schooltutor.web.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String home() {
        System.out.println("History starts here");
        return "helloworld";
    }

}