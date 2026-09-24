package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getEmployees() {
        return List.of(
                new Employee(1L, "Lokesh", "Java Developer"),
                new Employee(2L, "John", "Backend Developer")
        );
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return new Employee(id, "Employee " + id, "Java Developer");
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employee;
    }
}
