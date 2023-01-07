package com.taskmanagement.Task.Service.Impl;

import com.taskmanagement.Task.Domain.Epic;
import com.taskmanagement.Task.Repository.EpicRepository;
import com.taskmanagement.Task.Service.EpicService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class EpicServiceImplementation implements EpicService {

    @Autowired
    public EpicRepository epicRepository;

    @Override
    public List<Epic> findAllEpics() {
        return epicRepository.findAll();
    }

    @Override
    public Optional<Epic> findById(Long id) {
        Objects.requireNonNull(id,"Id is null");
        return epicRepository.findById(id);
    }
}
