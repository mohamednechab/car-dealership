package com.m2i.cardealership.controller;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class Appointment {
    @GetMapping("/appointment")
    String getAppointmentPage(Authentication authentication)  {
        final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        List<String> collect = authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList());
        if (collect.contains("ROLE_CLIENT")){
            return "appointment";
        }
        return "home";
    }
}
