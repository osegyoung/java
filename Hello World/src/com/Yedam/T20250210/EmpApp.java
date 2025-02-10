package com.Yedam.T20250210;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
 * 실행 클래스
 */
public class EmpApp {
	static Scanner scn = new Scanner(System.in);

	static Employee dao = new Employee();

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("1.등록 2.목록 3.수정(급여) 4.삭제 5.조회(조건:입사일자) 6.종료");
			System.out.println("기능을 선택하세요 : ");
			int menu = 0;

			try {
				menu = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("메뉴를 확인하세요");

				scn.nextLine();
				continue;
			}
			scn.nextLine();
			switch (menu) {

			case 1:// 등록
				int empNo = 0;
				while (true) {
					try {
						System.out.println("사번입력 >>  ");
						String empNo1 = scn.nextLine();						

						break;
					} catch (InputMismatchException e) {
						System.out.println("사원번호를 다시 입력하세요");

					}
				}
				System.out.println("이름 >> ");
				String eName = scn.nextLine();
				System.out.println("전화번호 >> ");
				String telNO = scn.nextLine();
				System.out.println("입사일자 >> ");
				String hireDate = scn.nextLine();				
				System.out.println("급여 >> ");
				int salary = Integer.parseInt(scn.nextLine());
				
				
				if(dao.registerEmp(new Employee(empNo, eName, telNO, "", salary))) {
				}
				System.out.println("등록성공");
				break;

			case 2:// 목록
					// 조회결과
				List<Employee> result = dao.searchAll();

				// 출력
				System.out.println("사번 이름 전화번호");
				for (Employee empl : result) {
					if (empl != null) {
						System.out.println(empl.empInfo());
					}
				}
				break;

			case 3:
				System.out.println("사원번호 >> ");
				String empNo1 = scn.nextLine();
				System.out.println("급여 >> ");
				int sal = Integer.parseInt(scn.nextLine());
				
				
				if (dao.modifyEmp(new Employee(empNo1,"","","", sal))) {
					System.out.println("수정완료");
				}
				break;

			case 4:// 삭제
				try {
					remove();
				} catch (NumberFormatException e) {
					System.out.println("사번을 확인");
				}
				break;

			case 5:
				System.out.println("조건:입사일자 >>(형식: yyyy-MM-dd)"); // 2023-12-01이후
				String hireDate1 = scn.nextLine();
				List<Employee> empResult = dao.searchByHireDate(hireDate1);

				System.out.println("사번 이름 입사일자");
				for (Employee empl : empResult) {
					if (empl != null) {
						System.out.println(empl.empInfo());
					}
				}
				break;

			case 6:// 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 확인하세요");
			}// end of switch

		} // end of while
		System.out.println("end of prog");
	}// end of main

	static void remove() throws NumberFormatException {
		System.out.println("사번 >> ");

		int empNo = Integer.parseInt(scn.nextLine());
		if (dao.removeEmp(empNo)) {
			System.out.println("삭제완료");
		}
	}// end of remove.
}// end of class
