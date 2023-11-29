package com.example.nxenesitproject.mappers;

import com.example.nxenesitproject.entity.Student;
import com.example.nxenesitproject.models.StudentChangeStatusDto;
import com.example.nxenesitproject.models.StudentDto;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {


    public Student toEntity (StudentDto from){
        var to = new Student();
        to.setId(from.getId());
        to.setName(from.getName());
        to.setLastName(from.getLastName());
        to.setBirthdate(from.getBirthdate());
        to.setRegisterDate(from.getRegisterDate());
        to.setGrade(from.getGrade());
        to.setActive(from.isActive());
        to.setCreatedBy(from.getCreatedBy());
        return to;
    }

    public  StudentDto toDto(Student from){
        var to = new StudentDto();
        to.setId(from.getId());
        to.setName(from.getName());
        to.setLastName(from.getLastName());
        to.setBirthdate(from.getBirthdate());
        to.setRegisterDate(from.getRegisterDate());
        to.setGrade(from.getGrade());
        to.setActive(from.isActive());
        to.setCreatedBy(from.getCreatedBy());
        return to;
    }

    public StudentChangeStatusDto toChangeStatusDto (Student from){
        var to = new StudentChangeStatusDto();
        to.setId(from.getId());
        to.setActive(from.isActive());
        return to;
    }
}
