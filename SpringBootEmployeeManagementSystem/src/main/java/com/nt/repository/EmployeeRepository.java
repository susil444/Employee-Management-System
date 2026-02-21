package com.nt.repository;

import com.nt.model.Employee;
import java.util.List;

public interface EmployeeRepository {
    int save(Employee employeeentity);
    List<Employee> findAll();
    Employee findById(int id);
    int update(int id, Employee employee);
    int delete(int id);
}
