package com.example.demo.entity;

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