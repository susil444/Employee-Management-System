package com.nt.repository;
import com.nt.model.Employee;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

	@Repository
	public class EmployeeRepositoryImpl implements EmployeeRepository {

	    private final JdbcTemplate jdbcTemplate;

	    public EmployeeRepositoryImpl(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }

	    private RowMapper<Employee> rowMapper = (rs, rowNum) -> {
	        Employee e = new Employee();
	        e.setId(rs.getInt("id"));
	        e.setName(rs.getString("name"));
	        e.setEmail(rs.getString("email"));
	        e.setDepartment(rs.getString("department"));
	        return e;
	    };

	    @Override
	    public int save(Employee employee) {
	        String sql = "INSERT INTO employee(name, email, department) VALUES (?, ?, ?)";
	        return jdbcTemplate.update(sql, employee.getName(), employee.getEmail(), employee.getDepartment());
	    }

	    @Override
	    public List<Employee> findAll() {
	        return jdbcTemplate.query("SELECT * FROM employee", rowMapper);
	    }

	    @Override
	    public Employee findById(int id) {
	        String sql = "SELECT * FROM employee WHERE id = ?";
	        return jdbcTemplate.queryForObject(sql, rowMapper, id);
	    }

	    @Override
	    public int update(int id, Employee employee) {
	        String sql = "UPDATE employee SET name=?, email=?, department=? WHERE id=?";
	        return jdbcTemplate.update(sql,
	                employee.getName(),
	                employee.getEmail(),
	                employee.getDepartment(),
	                id);
	    }

	    @Override
	    public int delete(int id) {
	        String sql = "DELETE FROM employee WHERE id=?";
	        return jdbcTemplate.update(sql, id);
	    }
	}

