package edu.usmp.demomvc.repository;

import org.springframework.stereotype.Repository;

import edu.usmp.demomvc.domain.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
 
}
