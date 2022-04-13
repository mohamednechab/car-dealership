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
@Table(name="user")
@Entity
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fname;
    private String lname;
    @Column(unique = true)
    private String login;
    private String password;
    @OneToOne
    private Location location;
    @OneToOne
    private Role role;
}
