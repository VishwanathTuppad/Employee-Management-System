package com.example.demoEMS.repository;

import com.example.demoEMS.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
    // made some changes here
}
