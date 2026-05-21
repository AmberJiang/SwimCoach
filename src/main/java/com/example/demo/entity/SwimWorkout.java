package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
public class SwimWorkout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime workoutDate;

    private String strokeType;

    private Integer distanceMeters;

    private Integer durationSeconds;

    private Double calories;

    private Integer avgHeartRate;

    private Integer poolLength;

    private Integer laps;

    // getter setter
}