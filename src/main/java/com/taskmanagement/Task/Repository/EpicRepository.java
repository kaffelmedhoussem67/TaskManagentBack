package com.taskmanagement.Task.Repository;

import com.taskmanagement.Task.Domain.Epic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EpicRepository extends JpaRepository<Epic, Long> {
    List<Epic> findAll();

    Optional<Epic> findById(Long id);
}
