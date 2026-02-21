package com.nt.model;

import org.jspecify.annotations.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private String department;
	public void setId(int int1) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setDepartment(String string) {
		// TODO Auto-generated method stub
		
	}
	public @Nullable Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public @Nullable Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public @Nullable Object getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

		// TODO Auto-generated method stub
		
	}
