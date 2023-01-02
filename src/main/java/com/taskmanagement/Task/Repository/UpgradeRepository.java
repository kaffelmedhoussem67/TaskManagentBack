package com.taskmanagement.Task.Repository;

import com.taskmanagement.Task.Domain.Upgrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UpgradeRepository extends JpaRepository<Long, Upgrade> {
}
