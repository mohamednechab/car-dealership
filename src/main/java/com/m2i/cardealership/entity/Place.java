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
@Table(name="place")
@Entity
public class Place {
    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean isDisponible;
    @OneToOne
    private Store store;
}
