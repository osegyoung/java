package com.Yedam.T20250210;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Employee {
	private int empNO = 0;
	private String empName = null;
	private String telNO = null;
	private Date hireDate = new Date();
	private int salary = 0;

	// 생성자.
	public Employee() {

	}

	public Employee(int empNO, String empName, String telNo) {
		this.empNO = empNO;
		this.empName = empName;
		this.telNO = telNo;
		this.hireDate = new Date();
		this.salary = 300;
	}

	public Employee(int empNO, String empName, String telNo, String hireDate, int salary) {
		this(empNO, empName, telNo);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.hireDate = sdf.parse(hireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.salary = salary;
	}

	// 사번, 이름, 연락처, 급여.
//	public String empInfo(empNo, empName, telNO, hireDate, "") {
//		// 사번 이름 연락처 급여
//		// ---------------------
//		// 1001 홍길동 234-1234 250
//		return empNO + " " + empName + " " + telNO + " " + hireDate + " " + salary;
//	}

	// getter,setter

	public int getEmpNO() {
		return empNO;
	}

	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getTelNO() {
		return telNO;
	}

	public void setTelNO(String telNO) {
		this.telNO = telNO;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		try {
			this.hireDate = sdf.parse(hireDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean modifyEmp(Employee employee) {
		return false;
	}

	public boolean removeEmp(int empNo2) {
		return false;
	}

	public List<Employee> search(Employee emp) {
		return null;
	}

	public List<Employee> search(int empNo) {
		return null;
	}

	public List<Employee> searchByHireDate(String hireDate) {
		return null;
	}

	public List<Employee> searchAll() {
		
		return null;
	}

	public boolean registerEmp(Employee employee) {
		
		return false;
	}

	public void setHireDate(Date hireDate2) {
		
		
	}
}
