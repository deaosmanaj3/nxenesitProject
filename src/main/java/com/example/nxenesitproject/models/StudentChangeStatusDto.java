package com.example.nxenesitproject.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentChangeStatusDto {
    private long id;
    private boolean active = true;
}
