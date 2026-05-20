package com.example.demo.repository;

import com.example.demo.entity.SwimWorkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwimWorkoutRepository
        extends JpaRepository<SwimWorkout, Long> {
}