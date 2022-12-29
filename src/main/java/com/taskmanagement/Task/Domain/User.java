package com.taskmanagement.Task.Domain;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstName")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "password")
    private String password;

    @Column(name = "mail")
    private String mail;

    @Column(name = "phone")
    private Integer phonenumber;

    @Column(name = "createdate")
    private LocalDate creationDate;

    @Column(name = "modificationdate")
    private LocalDate modificationDate;

}
