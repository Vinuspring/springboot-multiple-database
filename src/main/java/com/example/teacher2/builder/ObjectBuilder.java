package com.example.teacher2.builder;

import com.example.teacher2.entity1.Student;
import com.example.teacher2.entity1.StudentDTO;
import com.example.teacher2.entity2.Teacher;
import com.example.teacher2.entity2.TeacherDTO;

public class ObjectBuilder {


    public  static Student createStudentFromStudentDTO(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setSchoolName(studentDTO.getSchoolName());
        student.setStandard(studentDTO.getStandard());
        return student;
    }


    public static Teacher createTeacherFromTeacherDTO(TeacherDTO teacherDTO) {

        Teacher teacher = new Teacher();
        teacher.setName(teacherDTO.getName());
        teacher.setSubject(teacherDTO.getSubject());
        return teacher;
    }
}
