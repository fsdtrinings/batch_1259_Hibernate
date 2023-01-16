package com.abc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id  // PK
	private int empId;
	private String empName;
	private int salary;
	private int deptId;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, int salary, int deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptId;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (deptId != other.deptId)
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", deptId=" + deptId + "]";
	}
	
	
}
