package com.m2i.cardealership.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

//lambok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//jpa
@Table(name="arrival")
@Entity
public class Arrival {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date date;
    @OneToOne
    private Store store;
    @OneToMany
    private Set<Car> cars;
}
