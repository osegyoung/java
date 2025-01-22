package com.Yedam;

import java.util.Scanner;

/*
 * 친구정보관리 앱 v1
 * 이름, 연락처, 성별(남,여) => 홍길동, 010-1234-1234,남
 * 1. 목록(이름,연락처,성별) 2.등록  3.조회(성별) 4.삭제(이름) 5.수정(이름):연락처를 수정 9.종료
 * String[] friendAry 크기는 100개;
 */
public class Todo2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] friendAry = new String[100];
		friendAry[0] = "홍길동,010-1234-5678,남";
		friendAry[1] = "홍길동,010-1234-5670,여";
		friendAry[2] = "박길동,010-1234-5679,남";
		boolean run = true;

		while (run) {
			System.out.println("1.목록, 2.등록 3.조회(성별) 9.종료");
			System.out.println("선택하세요 > ");
			int menu = Integer.parseInt(scn.nextLine());
			System.out.println(menu);

			switch (menu) {
			case 1:
//				System.out.print("이름을 입력하세요> " );
//				String fff = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
//						if(fff.equals(friendAry[i].split(",")[0])) {
						System.out.printf("%s의 전화번호는 %s이고 %s 입니다.\n", friendAry[i].split(",")[0],
								friendAry[i].split(",")[1], friendAry[i].split(",")[2]);

					}

				}

				System.out.print("이상입니다.");

				break;
			case 2:
				System.out.printf("이름,연락처,성별을 입력하세요> ");
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] == null) {
						friendAry[i] = scn.nextLine();
						break;
					}
				}
				break;

			case 3:
				System.out.print("성별을 입력하세요 > ");
				String fff = scn.nextLine();
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						if (fff.equals(friendAry[i].split(",")[2])) {
							System.out.printf("%s의 전화번호는 %s이고 %s 입니다.\n", friendAry[i].split(",")[0],
									friendAry[i].split(",")[1], friendAry[i].split(",")[2]);

						}
					}
				}
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;// end of switch
			}
		} // end of while

		System.out.println("end of prog");

	}// end of main
}// end of class
