package com.Yedam.T20250210;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * 저장공간(List<Employee> storage)
 */
public interface EmpDAO {
	
	List<Employee> empList = new ArrayList<Employee>();
	
	public default void EmpListExe() {
		empList.add(new Employee(23-12,"김길동", "943-1244"));
		empList.add(new Employee(23-13,"박길동", "943-1254"));
		empList.add(new Employee(23-19,"김신입", "943-1254" , "2023-12-01", 0));
		empList.add(new Employee(23-20,"박신입", "943-1254","2023-12-02", 0));
		empList.add(new Employee(23-21,"최신입", "943-1254", "2023-12-03", 0));
	}

	public boolean registerEmp(Employee emp);
	
	
	
	
	public default boolean modifyEmp(Employee emp) {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	for (int i = 0; i < empList.size(); i++) {
		// 사원번호 비교.
		if (empList.get(i).getEmpNO() == emp.getEmpNO()) {
			// 연락처 값이 "" 이 아닐때 변경
			if (emp.getTelNO() != null && !emp.getTelNO().equals("")) {
				empList.get(i).setEmpNO(emp.getEmpNO());
			}
			try {
				// 값을 변경안하려고 엔터("")일 경우 1900-01-01
				if (!emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
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

	public default boolean removeEmp(int empNo) {
	for (int i = 0; i < empList.size(); i++) {
		if (empList.get(i).getEmpNO() == empNo) {
			empList.remove(i);
			return true;
		}
	}
	return false;
}
	public default List<Employee> searchByHireDate(String hireDateStr) {
        List<Employee> result = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date inputDate = sdf.parse(hireDateStr); // 사용자가 입력한 날짜

            // 입사일자 비교
            for (Employee emp : empList) {
                if (emp.getHireDate().after(inputDate)) { // 입사일자가 입력된 날짜 이후인 경우
                    result.add(emp);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
	public List<Employee> search(Employee emp);
	
	
}
