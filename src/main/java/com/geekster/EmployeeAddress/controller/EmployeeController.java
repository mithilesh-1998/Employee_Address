package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

//    GET /employees - get all employees

    @GetMapping("employee")
    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    //    GET /employees/{id} - get an employee by id
    @GetMapping("employee/{id}")
    public Employee getEmployeeByID(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }
    //    POST /employees - create a new employee
    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    //    PUT /employees/{id} - update an employee by id
    @PutMapping("employee/{id}")
    public String updateFirstname(@PathVariable Long id , @RequestParam String firstName){
        return employeeService.updateFirstname(id, firstName);
    }
    //    DELETE /employees/{id} - delete an employee by id
    @DeleteMapping("employee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }
}
