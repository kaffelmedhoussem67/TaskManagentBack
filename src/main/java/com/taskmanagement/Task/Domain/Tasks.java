package com.taskmanagement.Task.Domain;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "tasks")
public class Tasks extends Epic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "epic_id")
    private Epic epic;


}
