package com.m2i.cardealership.controller;


import com.m2i.cardealership.entity.Car;
import com.m2i.cardealership.service.ICarService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class Sale {
    private final ICarService carService;

    public Sale(ICarService carService) {
        this.carService = carService;
    }

    @GetMapping("/sale/cars/forSale")
    String getAllCarsForSale(Authentication authentication)  {
        final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        List<String> collect = authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList());
        if (collect.contains("ROLE_GESTIONNAIRE") || collect.contains("ROLE_COMMERCIAL")){
            String userLogin = ((UserDetails)authentication.getPrincipal()).getUsername();
            carService.getAllCarsForSale(userLogin);
            System.out.println(userLogin);
            return "cars";
        }
        return "home";
    }
}
