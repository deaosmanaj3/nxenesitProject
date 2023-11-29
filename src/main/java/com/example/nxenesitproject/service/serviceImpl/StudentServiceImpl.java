package com.example.nxenesitproject.service.serviceImpl;

import com.example.nxenesitproject.mappers.StudentMapper;
import com.example.nxenesitproject.models.StudentDto;
import com.example.nxenesitproject.repository.StudentRepository;
import com.example.nxenesitproject.service.StudentService;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    private final StudentMapper mapper;

    public StudentServiceImpl(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public boolean add(StudentDto studentDto) {
        var entity = mapper.toEntity(studentDto);
        repository.save(entity);
        return true;
    }

    @Override
    public List<StudentDto> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public StudentDto getById(long studentId) {
        var optionalEntity = repository.findById(studentId);
        if (optionalEntity.isEmpty())
            throw new EntityNotFoundException("Student not found!");
        var entity = optionalEntity.get();
        var dto = mapper.toDto(entity);
        return dto;
    }

    @Override
    public boolean update(long studentId, StudentDto updatedStudentDto) {
        var optionalStudent = repository.findById(studentId);
        if (optionalStudent.isEmpty())
            throw new EntityNotFoundException("Student not found with id " + studentId);

        var entity = optionalStudent.get();

        entity.setName(updatedStudentDto.getName());
        entity.setLastName(updatedStudentDto.getLastName());
        entity.setGrade(updatedStudentDto.getGrade());

        repository.save(entity);
        return true;
    }

    @Override
    public boolean deleteById(long studentId) {
        repository.deleteById(studentId);
        return true;
    }
}