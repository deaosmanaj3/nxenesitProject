package com.example.nxenesitproject.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String lastName;
    private LocalDate birthdate;
    private LocalDate registerDate;
    private Double grade;
    private boolean active = true;
    private String createdBy;



}
