package com.taskmanagement.Task.Repository;

import com.taskmanagement.Task.Domain.Epic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpicRepository extends JpaRepository<Long, Epic> {
}
