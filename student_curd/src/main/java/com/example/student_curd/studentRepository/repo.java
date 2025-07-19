package com.example.student_curd.studentRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student_curd.entity.student;






@Repository
public interface repo  extends JpaRepository<student, Long > {
	Optional<student> findByEmail(String email);
	void deleteById(Long id);

}
