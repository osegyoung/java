package com.Yedam.Interface.emp;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * EmpDAo(인터페이스) 구현하는 클래스.
 */
public class EmpDBExe implements EmpDAO {

	Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public boolean registerEmp(Employee emp) {	
		return false;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		String query = "insert into tbl_employees";
		query += "values ("+emp.getEmpNO()+", "+emp.getEmpName() + ", "+ emp.getTelNO() + " , "+emp.getHireDate() + " , "+emp.getSalary() + ")";
		
		try {
			Statement stmt = (Statement) getConnect().createStatement();
			int r = stmt.executeUpdate(query);
			if(r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {

		return false;
	}

	@Override
	public List<Employee> search(Employee emp) {
		List<Employee> empList = new ArrayList<>();
		String qry = "select * from tbl_employees" +" where emp_name =nvl('"+emp.getEmpName() + "', emp_name)" + " order by emp_no";
	
		try {
			Statement stmt =  getConnect().createStatement();
			ResultSet rs =  stmt.executeQuery(qry);

			// 조회결과
			while (rs.next()) {
				Employee empl = new Employee();
				empl.setEmpNO(rs.getInt("emp_no"));
				empl.setEmpName(rs.getString("emp_name"));
				empl.setHireDate(rs.getDate("hire_date"));
				empl.setSalary(rs.getInt("salary"));
				empl.setTelNO(rs.getString("tel_no"));
				
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
