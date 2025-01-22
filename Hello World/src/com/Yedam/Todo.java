package com.Yedam;

import java.util.Scanner;

//com.yedam.Todo 
public class Todo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0; // 예금액. 54000 50000 : 10만원초과 : "초과금액입니다."," 잔액을 확인하세요"
		int money = 0;
		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
			System.out.print("메뉴를 선택하세요> ");
			int num =Integer.parseInt(scn.nextLine()); // 문자일때는 String, nextLine 쓰기 , 문자타입반환. -> int 변환

			if (num == 1) { // 입금
				System.out.print("입금액을 입력> ");
				balance += Integer.parseInt(scn.nextLine());
				if (balance + money > 100000) {
					System.out.println("초과급액 입니다.");
				}else {
					balance += money;
					System.out.println("입금완료");
				}
					
			} else if (num == 2) {// 출금.
				System.out.print("출금액을 입력> ");
				money -= Integer.parseInt(scn.nextLine());
				
				if (balance< money) {
					System.out.println("잔액을 확인하세요.");
				}else {
					balance -= money;
					System.out.println("출금완료");
				}	
			} else if (num == 3) { // 잔액조회
				System.out.printf("현재 잔액은 %d 입니다.\n", balance);
				
				
			} else if (num == 4) { // 종료
				System.out.println("프로그램을 종료합니다.");
				break;

			}
		}
		System.out.printf("end of prog\n");
	}
}