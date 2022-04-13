package com.m2i.cardealership.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//lambok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//jpa
@Table(name = "store")
@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToOne
    private Location location;
    @OneToOne
    private User manager;
}
