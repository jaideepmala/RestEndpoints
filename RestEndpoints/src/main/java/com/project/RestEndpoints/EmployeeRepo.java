package com.project.RestEndpoints;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String> {


    Employee findById(Long id);
    List<Employee> findAll();
    void deleteById(Long id);
}
