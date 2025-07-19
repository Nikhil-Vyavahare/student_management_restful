package com.example.student_curd.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_curd.entity.student;
import com.example.student_curd.service.StudentService;



@RestController
@RequestMapping("students")
public class Controller {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/read")
    public List<student> getAllStudents() {
        return studentService.getAllStudents();
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody student Student) {
        return ResponseEntity.ok(studentService.createStudent(Student));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable Long id, @RequestBody student Student) {
        return ResponseEntity.ok(studentService.updateStudent(id, Student));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
       return ResponseEntity.ok("Student with ID " + id + " deleted successfully.");
    }


}
