package com.example.student_curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_curd.Exceptions.DataNotFoundException;
import com.example.student_curd.Exceptions.DuplicateDataFoundException;
import com.example.student_curd.entity.student;
import com.example.student_curd.studentRepository.repo;





@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	repo repository;

	@Override
	public List<student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public student getStudentById(Long id) {
		return repository.findById(id).orElseThrow(()-> new DataNotFoundException("Student not found with Id:"+id));

	}

	@Override
	public student createStudent(student Student) {
		if(repository.findByEmail(Student.getEmail()).isPresent()){
			throw new DuplicateDataFoundException("Student is already  exist Email: "+ Student.getEmail());
		}
		return	repository.save(Student);
	}


	@Override
	public void deleteStudent(Long id) {
		if(! repository.findById(id).isPresent()){
			throw new  DataNotFoundException("Student not found with Id:"+id);
		}
		repository.deleteById(id);
	}

	@Override
	public student updateStudent(Long id, student student) {
		student existingStudent = repository.findById(id).get();
	    existingStudent.setFirstName(student.getFirstName());
	    existingStudent.setLastName(student.getLastName());
	    existingStudent.setGender(student.getGender());
	    existingStudent.setDateOfBirth(student.getDateOfBirth());
	    existingStudent.setEmail(student.getEmail());
	    existingStudent.setPhone(student.getPhone());
	    existingStudent.setAddress(student.getAddress());
	    existingStudent.setCity(student.getCity());
	    existingStudent.setState(student.getState());
	    existingStudent.setPincode(student.getPincode());
	    existingStudent.setEnrollmentDate(student.getEnrollmentDate());
	    existingStudent.setCourse(student.getCourse());

	    return repository.save(existingStudent);

		
	}


}
