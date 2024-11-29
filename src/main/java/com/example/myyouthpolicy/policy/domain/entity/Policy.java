package com.example.myyouthpolicy.policy.domain.entity;

import java.time.LocalDate;

import com.example.myyouthpolicy.global.domain.entity.BaseTimeEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Policy extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
}
