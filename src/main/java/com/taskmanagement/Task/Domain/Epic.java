package com.taskmanagement.Task.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;



@Entity
@Data
@Table(name ="epic")
public class Epic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "createDate")
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "epic")
    private List<Tasks> tasks;

    @Column(name = "priority")
    private String priority;

    @Column(name = "modificationdate")
    private LocalDate modificationDate;
}
