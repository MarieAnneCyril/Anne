package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_annodemo12")
public class EmpPojo_Annotation {
	@Column(name="emp_no")
	@Id
	int Emp_num;
	@Column(name="ename")
	String Emp_name;
	@Column(name="esalary")
	float Emp_salary;
	public final int getEmp_num() {
		return Emp_num;
	}
	public final void setEmp_num(int emp_num) {
		Emp_num = emp_num;
	}
	public final String getEmp_name() {
		return Emp_name;
	}
	public final void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public final float getEmp_salary() {
		return Emp_salary;
	}
	public final void setEmp_salary(float emp_salary) {
		Emp_salary = emp_salary;
	}
	
	

}
