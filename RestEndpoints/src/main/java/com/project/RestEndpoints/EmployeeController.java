package com.project.RestEndpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/jd")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    // Home Page
    @GetMapping(
            path = "/",
            produces = "application/json")
    public @ResponseBody String welcome() {
        return "<html><body>"
                + "<h1>WELCOME</h1>"
                + "</body></html>";
    }

    // Implementing a GET method
    // to get the list of all
    // the employees

    @GetMapping(path = "/getAllEmployees")
    public  List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }
    // Get the company details by
    // ID
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(
            @PathVariable(value = "id") Long id)
    {
        return employeeRepo.findById(id);
    }

    // Create a POST method
    // to add an employee
    // to the list
    @PostMapping("/addEmployee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addCompany(
            @RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }

//    @DeleteMapping("/delete/{id}")
//    public void deleteStudent(
//            @PathVariable(value = "id") Long id)
//    {
//        employeeRepo.deleteById(id);
//    }
//
//    @PutMapping("/employee/{id}")
//    public ResponseEntity<Object> updateEmployee(
//            @RequestBody Employee employee,
//            @PathVariable Long id)
//    {
//
//        Optional<Employee> empRepo
//                = Optional.ofNullable(
//                employeeRepo.findById(id));
//
//        if (!empRepo.isPresent())
//            return ResponseEntity
//                    .notFound()
//                    .build();
//
//        employee.setId(id);
//
//        employeeRepo.save(employee);
//
//        return ResponseEntity
//                .noContent()
//                .build();
//    }
}