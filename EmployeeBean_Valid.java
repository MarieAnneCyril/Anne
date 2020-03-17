package com.cts;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeBean_Valid {
	@Min(4)
	String eno;
	
	@Size(min=5,max=20)
	String name;
	
	@Min(value=20000,message="salary must be equal or greater than 20000")
	@Max(value=45000,message="salary must be equal or less than 45000")
float salary;
	
	@Pattern(regexp="^[a-zA-Z0-9]{6}",message="must be of 6 digit")
	String postal_code;

	public final String getEno() {
		return eno;
	}

	public final void setEno(String eno) {
		this.eno = eno;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final float getSalary() {
		return salary;
	}

	public final void setSalary(float salary) {
		this.salary = salary;
	}

	public final String getPostal_code() {
		return postal_code;
	}

	public final void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	
	
}
