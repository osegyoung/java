package com.Yedam;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
//		String[] strAry = new Strig[10];
//		strAry[0] = "홍길동";
//		String name = "김길동";
//		for(int i =0; i < strAry.length; i++) {
//			if (strAry[i] == null) { 
//				strAry[i] = name;
//				break;
//			}
//		}
//		
//		for(int i =0; i < strAry.length; i++) {
//			if(strAry[i] != null) {
//				System.out.println(strAry[i]);
//			}
//		}
//		Scanner scn = new Scanner(System.in);
//		System.out.println("이름 입력 >> ");
//		String searchName = scn.nextLine();
//		System.out.println("박우식". equals(searchName)); // 비교연산자 x


		Scanner scn = new Scanner(System.in);

		String[] studentAry = new String[100];
		studentAry[0] = "김민지,99";
		studentAry[1] = "홍길동,99";
		studentAry[2] = "김길동,99";
		boolean run = true;

		while (run) {
			System.out.println("1.학생이름, 점수 2. 최고점수 3. 학생입력(단건) 4.조회(이름) 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());
			System.out.println(menu);

			switch (menu) {
			case 1:
				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("이름과 점수를 입력하세요 > ");
					studentAry[i] = scn.nextLine();
				}
				System.out.println("등록완료");
				break;
			case 2:
				int max = 0;

				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) { // null값이 아닐 경우 = 값이 있을 경우.
						int temp = Integer.parseInt(studentAry[i].split(",")[1]);
						if (max < temp) {
							max = temp;
						}
					}
				}
				break;
			case 3:
				System.out.print("이름과 점수를 입력하세요 > ");
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) {
						studentAry[i] = scn.nextLine();
						break;
					}
				}
				break;
			case 4:
				System.out.print("이름을 입력하세요> ");
				String anames = scn.nextLine();
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						if (anames.equals(studentAry[i].split(",")[0])) {
							System.out.printf("%s의 점수는 %s 입니다.\n", studentAry[i].split(",")[0],
									studentAry[i].split(",")[1]);
						}
					}
				}
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break; // switch
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}

		} // end of while.

		System.out.println("end of prog");

	}// end of main.
}// end of class.
