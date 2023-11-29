package com.example.nxenesitproject.controllers;

import com.example.nxenesitproject.models.StudentDto;
import com.example.nxenesitproject.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService service) {
        this.studentService = service;
    }

    @GetMapping
    public List<StudentDto> getAllStudents() {
        return studentService.getAll();
    }

    @GetMapping("/{studentId}")
    public StudentDto getStudentById(@PathVariable long studentId) {
        return studentService.getById(studentId);
    }

    @PostMapping
    public void addStudent(@RequestBody StudentDto studentDto) {
        studentService.add(studentDto);
    }

    @PutMapping("/{studentId}")
    public void updateStudent(@PathVariable long studentId, @RequestBody StudentDto studentDto) {
        studentService.update(studentId, studentDto);
    }

    @DeleteMapping("/{studentId}")
    public void deleteById(@PathVariable long studentId) {
        studentService.deleteById(studentId);
    }
}