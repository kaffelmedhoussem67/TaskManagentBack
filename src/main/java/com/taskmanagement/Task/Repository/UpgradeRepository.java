package com.taskmanagement.Task.Repository;

import com.taskmanagement.Task.Domain.Upgrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpgradeRepository extends JpaRepository<Long, Upgrade> {
}
