package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;
    public Iterable<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepo.findAllById(id);

    }

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Saved";
    }

    public String deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
        return "Deleted";
    }

    public String updateFirstname(Long id, String firstName) {
        Optional<Employee> myEmp=employeeRepo.findById(id);
        Employee emp=null;
        if(myEmp.isPresent()){
            emp= myEmp.get();
        }else{
            return "Employee Not Found";
        }
        emp.setFirstName(firstName);
        employeeRepo.save(emp);
        return "FirstNameUpdated";

    }
}
