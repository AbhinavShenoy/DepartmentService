package com.deloitte.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.springboot.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
