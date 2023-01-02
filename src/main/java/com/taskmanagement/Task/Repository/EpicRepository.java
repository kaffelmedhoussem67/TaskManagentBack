package com.taskmanagement.Task.Repository;

import com.taskmanagement.Task.Domain.Epic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EpicRepository extends JpaRepository<Long, Epic> {
}
