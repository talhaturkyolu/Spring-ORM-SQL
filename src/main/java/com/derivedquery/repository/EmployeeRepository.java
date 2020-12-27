package com.derivedquery.repository;

import com.derivedquery.entity.Department;
import com.derivedquery.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
