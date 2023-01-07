package com.taskmanagement.Task.Service;

import com.taskmanagement.Task.Domain.Epic;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EpicService {

    List<Epic> findAllEpics();

    Optional<Epic> findById(Long id);
}
