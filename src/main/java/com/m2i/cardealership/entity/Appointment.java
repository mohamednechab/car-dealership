package com.m2i.cardealership.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

//lambok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//jpa
@Table(name="appointment")
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date data;
    @OneToOne
    private User user;
}
