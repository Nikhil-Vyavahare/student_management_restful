package com.example.student_curd.service;

import java.util.List;

import com.example.student_curd.entity.student;


public interface StudentService {
	List<student> getAllStudents();
    student getStudentById(Long id);
    student createStudent(student Student);
    student updateStudent(Long id,student Student);
    void deleteStudent(Long id);
}
