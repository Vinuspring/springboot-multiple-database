package com.example.teacher2.controller;

import com.example.teacher2.builder.ObjectBuilder;
import com.example.teacher2.entity1.Student;
import com.example.teacher2.entity1.StudentDTO;
import com.example.teacher2.entity2.Teacher;
import com.example.teacher2.entity2.TeacherDTO;
import com.example.teacher2.repo1.StudentRepository;
import com.example.teacher2.repo2.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentTeacherRestController {

    @Autowired
    StudentRepository studentRepo;

    @Autowired
    TeacherRepository teacherRepo;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody StudentDTO studentDTO) {
        Student student = ObjectBuilder.createStudentFromStudentDTO(studentDTO);
        return studentRepo.save(student);
    }

    @PostMapping("/saveTeacher")
    public Teacher saveTeacher(@RequestBody TeacherDTO teacherDTO) {
        Teacher teacher = ObjectBuilder.createTeacherFromTeacherDTO(teacherDTO);
        return teacherRepo.save(teacher);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    @GetMapping("/getAllTeachers")
    public List<Teacher> getAllTeachers(){
        return teacherRepo.findAll();
    }
}
