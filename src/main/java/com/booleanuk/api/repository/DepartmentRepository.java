package com.booleanuk.api.repository;

import com.booleanuk.api.model.Department;
import com.booleanuk.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
