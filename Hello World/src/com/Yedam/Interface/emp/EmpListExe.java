package com.Yedam.Interface.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 컬랙션 활용.
 */
public class EmpListExe implements EmpDAO {
	// 필드
	List<Employee> empList = new ArrayList<Employee>(); // 저장공간

	// 생성자
	public EmpListExe() {
		// 초기값.
		empList.add(new Employee(1001, "홍길동", "432-1234"));
		empList.add(new Employee(1011, "박길동", "432-1212"));
		empList.add(new Employee(1021, "김사원", "432-1255"));
		empList.add(new Employee(1010, "박사장", "333-1212", "2000-01-01", 500));
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < empList.size(); i++) {
			// 사원번호 비교.
			if (empList.get(i).getEmpNO() == emp.getEmpNO()) {
				// 연락처 값이 "" 이 아닐때 변경
				if (!emp.getTelNO().equals("")) {
					empList.get(i).setEmpNO(emp.getEmpNO());
				}
				try {
					// 값을 변경안하려고 엔터("")일 경우 1900-01-01
					if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						empList.get(i).setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}

				if (emp.getSalary() != 0) {
					empList.get(i).setSalary(emp.getSalary());
				}
				return true;// 정상수정
			}
		}
		return false;// 수정못함.
	}

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpNO() == empNo) {
				empList.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) { // sal 보다 급여가 많은
		List<Employee> result = new ArrayList<Employee>();

		for (int i = 0; i < empList.size(); i++) {
			// indexOf 사용.
			if (empList.get(i).getEmpName().indexOf(emp.getEmpName()) > -1) {
				result.add(empList.get(i));
			}
		}
		return result;
	}

	@Override
	public boolean registerEmp(Employee emp) {

		return false;
	}
}
