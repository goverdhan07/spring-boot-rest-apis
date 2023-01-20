package net.projects.springboot.controller;

import net.projects.springboot.model.Employee;
import net.projects.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    //build create employee REST api
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){ //this requesbody annonation is used to convert json into java code
        return employeeRepository.save(employee);
    }
}
