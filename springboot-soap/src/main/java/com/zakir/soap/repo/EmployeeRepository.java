package com.zakir.soap.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zakir.soap.entities.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{


	Employee findByEmployeeId(long employeeId);

}
