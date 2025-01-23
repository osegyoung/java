package com.Yedam;

import java.util.Scanner;

public class Todo3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[][] friendAry = new String[100][3];
		
		boolean run = true;

		while (run) {
			System.out.println("1.목록, 2.등록 3.조회(성별) 9.종료");
			System.out.println("선택하세요 > ");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("이름   연락처   성별");
				System.out.println("===================");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						System.out.printf("%s의 전화번호는 %s이고 %s 입니다.\n", friendAry[i][0]);

					}

				}

				System.out.print("이상입니다.");

				break;
			case 2:
				System.out.println("이름을 입력하세요 >> ");
				String name = scn.nextLine();

				System.out.println("연락처을 입력하세요 >> ");
				String phone = scn.nextLine();

				System.out.println("성별을 입력하세요 >> ");
				String gender = scn.nextLine();

				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] == null) {
//						System.out.println("i의 값["+i+"]" => +friendAry[i]);
						friendAry[i] = new String[] {name, phone, gender};
						break;
					}

				}
				break;

			case 3:
				System.out.print("성별을 입력하세요> ");
				String fff = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i][0] != null) {
						if(fff.equals(friendAry[i][2])) {
							System.out.printf("%s의 전화번호는 %s이고 성별은 %s 입니다.\n",friendAry[i][0],friendAry[i][1],friendAry[i][2]);
						}
					}
				}
			
			break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run=false;
				
			}//end of switch
		}//end of while
		System.out.println("end of prog");
	}// end of main



}// end of class

// end of class
