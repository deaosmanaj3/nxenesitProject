package com.example.nxenesitproject.service;

import com.example.nxenesitproject.models.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    boolean add(StudentDto studentDto);

    List<StudentDto> getAll();

    StudentDto getById(long studentId);

    boolean update(long studentId, StudentDto updatedStudentDto);

    boolean deleteById(long studentId);
}