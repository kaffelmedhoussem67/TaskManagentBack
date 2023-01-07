package com.taskmanagement.Task.Controller;

import com.taskmanagement.Task.Domain.Epic;
import com.taskmanagement.Task.Service.EpicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/spic")
public class EpicController {


    public EpicService epicService;

    @GetMapping
    public ResponseEntity<List<Epic>> getAllEpics() {
        List<Epic> epics = epicService.findAllEpics();
        return new ResponseEntity<>(epics, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Epic> getUserById(@PathVariable("id") Long id) {
        try {
            Optional<Epic> epic = epicService.findById(id);
            return new ResponseEntity<Epic>(epic.get(), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
