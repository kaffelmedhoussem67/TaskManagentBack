package com.taskmanagement.Task.Repository;

import com.taskmanagement.Task.Domain.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Long, Tasks> {
}
