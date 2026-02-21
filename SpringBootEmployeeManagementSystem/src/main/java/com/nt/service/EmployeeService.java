package com.nt.service;


import com.nt.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> findAll();
    Employee findById(int id);
    Employee update(int id, Employee employee);
    void delete(int id);
}

