package com.example.demo.controller;

import com.example.demo.entity.SwimWorkout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class SwimWorkoutController {

    @Autowired
    private SwimWorkoutRepository repository;

    @PostMapping
    public SwimWorkout create(
            @RequestBody SwimWorkout workout) {

        return repository.save(workout);
    }

    @GetMapping
    public List<SwimWorkout> getAll() {
        return repository.findAll();
    }
}