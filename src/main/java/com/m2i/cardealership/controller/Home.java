package com.m2i.cardealership.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class Home {
    @GetMapping("/home")
    String getHomePage(Authentication authentication)  {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority a: authorities){
            System.out.println(a.getAuthority());
        }
        return "home";
    }
}
