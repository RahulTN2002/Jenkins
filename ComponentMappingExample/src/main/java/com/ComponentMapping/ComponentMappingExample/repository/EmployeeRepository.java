package com.ComponentMapping.ComponentMappingExample.repository;

import com.ComponentMapping.ComponentMappingExample.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
