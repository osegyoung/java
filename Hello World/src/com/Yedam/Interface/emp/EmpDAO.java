package com.Yedam.Interface.emp;

import java.util.List;

/*
 * 등록,수정,삭제,조회.
 */
public interface EmpDAO {

	//등록
	public boolean registerEmp(Employee emp);
	//수정
	public boolean modifyEmp(Employee emp);
	//삭제
	public boolean removeEmp(int empNo);
	//조회
	public List<Employee> search(Employee emp);//search 할때 배열로 했었음.

}

