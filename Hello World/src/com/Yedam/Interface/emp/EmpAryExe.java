package com.Yedam.Interface.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * 배열활용.
 * 
 */
public class EmpAryExe implements EmpDAO {

	Employee[] employees = new Employee[10];// 저장.

	public EmpAryExe() {
	employees[0]=new Employee(1001,"홍길동","432-1234");
	employees[1]=new Employee(1011,"박길동","432-1212");
	employees[2]=new Employee(1021,"김사원","432-1255");
	employees[3]=new Employee(1010,"박사장","333-1212","2000-01-01",500);
	}

	@Override
	public boolean registerEmp(Employee emp) {
		for (int i = 0; i < employees.length; i++) {
			// 빈공간에 추가
			if (employees[i] == null) {
				employees[i] = emp;
				return true; // 정상등록
			}
		}
		return false;// 등록 실패

	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < employees.length; i++) {
			// 사원번호 비교.
			if (employees[i] != null && employees[i].getEmpNO() == emp.getEmpNO()) {
				// 연락처 값이 "" 이 아닐때 변경
				if (!emp.getTelNO().equals("")) {
					employees[i].setEmpNO(emp.getEmpNO());
				}
				try {
					// 값을 변경안하려고 엔터("")일 경우 1900-01-01
					if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						employees[i].setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}

				if (emp.getSalary() != 0) {
					employees[i].setSalary(emp.getSalary());
				}
				return true;// 정상수정
			}
		}
		return false;// 수정못함.

	}// end of modifyEmp()

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getEmpNO() == empNo) {
				employees[i] = null;
				return true;
			}
		}
		return false;

	}// end of removeEmp()

	@Override
	public Employee[] search(Employee emp) {

		return null;
	}

}// end of class
