package com.Yedam.Interface.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 사원번호(1001,1002)
 * 사원이름(홍길동, 김민수)
 * 전화번호(654-1234, 654-3456)
 * 입사일자)2020-02-04)
 * 급여(300,350)
 */
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
		this.salary = 250;
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
	
	//사번, 이름, 연락처, 급여.
	public String empInfo() {
		//사번 이름 연락처 급여
		//---------------------
		//1001 홍길동 234-1234 250
		return empNO + " " + empName + " " + telNO + " " + salary ;
	}
	
	
	
	//getter,setter

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

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}// end of class
