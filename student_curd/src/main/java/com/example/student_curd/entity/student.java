package com.example.student_curd.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Students")
public class student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long studentId;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Date_Of_Birth")
    private Date dateOfBirth;

    @Column(name = "Email" , unique = true)
    private String email;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Address")
    private String address;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private String state;

    @Column(name = "Pincode")
    private String pincode;

    @Column(name = "Enrollment_Date")
    private Date enrollmentDate;

    @Column(name = "Course")
    private String course;
    
    
    

}
