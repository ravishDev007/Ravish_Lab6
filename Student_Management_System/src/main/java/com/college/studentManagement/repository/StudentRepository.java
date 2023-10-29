package com.college.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college.studentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
