package com.taskmanagement.Task.Domain;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Nonnull
    @Column(name = "firstName")
    private String firstname;

    @Nonnull
    @Column(name = "lastname")
    private String lastname;

    @Nonnull
    @Column(name = "password")
    private String password;

    @Nonnull
    @Column(name = "mail")
    private String mail;

    @Column(name = "phone")
    @Pattern(regexp = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$")
    private Integer phonenumber;

    @Column(name = "createdate")
    private LocalDate creationDate;

    @Column(name = "modificationdate")
    private LocalDate modificationDate;

    @Column(name = "role")
    private  Role role;


    public enum Role {
        ADMIN,USER
    }
}
