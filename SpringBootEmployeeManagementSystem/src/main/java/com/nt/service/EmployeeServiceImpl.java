package com.nt.service;


import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeServiceImpl(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public Employee save(Employee employee) {
        repo.save(employee);
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        return repo.findAll();
    }

    @Override
    public Employee findById(int id) {
        return repo.findById(id);
    }

    @Override
    public Employee update(int id, Employee employee) {
        repo.update(id, employee);
        return employee;
    }

    @Override
    public void delete(int id) {
        repo.delete(id);
    }
}

