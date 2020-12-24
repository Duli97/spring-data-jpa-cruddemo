package com.luv2code.springboot.springdatajpacruddemo.dao;

import com.luv2code.springboot.springdatajpacruddemo.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // No need to write any code :)

}
