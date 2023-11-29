package com.example.nxenesitproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private long id;
    private String name;
    private String lastName;
    private LocalDate birthdate;
    private LocalDate registerDate;
    private Double grade;
    private boolean active = true;
    private String createdBy;
}
