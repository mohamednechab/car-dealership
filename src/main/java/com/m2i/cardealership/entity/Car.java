package com.m2i.cardealership.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

//lambok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//jpa
@Table(name="car")
@Entity
public class Car {
    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String marke;
    private String model;
    private BigDecimal price;
    private int mileage;
    private String year;
    private boolean isUnderRepair;
    private boolean forSale;
    @OneToOne
    private Place place;
    @OneToMany
    private Set<User> user;
}
