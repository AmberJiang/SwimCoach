package com.example.demo.service;

import com.example.demo.entity.SwimWorkout;
import com.example.demo.repository.SwimWorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


//保存 workout
//查询全部 workout
@Service
public class SwimWorkoutService {
    @Autowired
    private SwimWorkoutRepository repository;

    public List<SwimWorkout> getAllWorkOuts(){
       return repository.findAll();
    }

    public SwimWorkout create(
            SwimWorkout workout
    ) {
        return repository.save(workout);
    }
}
