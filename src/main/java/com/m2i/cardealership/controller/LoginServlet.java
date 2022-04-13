package com.m2i.cardealership.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LoginServlet {
//    @GetMapping("/authentication")
    @RequestMapping("/login")
    String login()  {
        return "authentication";
    }
}
