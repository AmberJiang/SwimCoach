package com.example.demo.controller;

import com.example.demo.entity.SwimWorkout;
import com.example.demo.repository.SwimWorkoutRepository;
import com.example.demo.service.SwimWorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class SwimWorkoutController {

    @Autowired
    private SwimWorkoutService service;

    @PostMapping
    public SwimWorkout create(
            @RequestBody SwimWorkout workout) {

        return service.create(workout);
    }

    @GetMapping
    public List<SwimWorkout> getAll() {
        return service.getAllWorkOuts();
    }
}