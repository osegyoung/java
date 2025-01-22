package com.Yedam;

import java.util.Scanner;

/*
* 학생점수 입력 받아서 배열저장.
* 최고점수, 평균, 합계점수 출력. 
*/
public class ForLoopExe1 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		// 정수배열.[]
		int[] scores = new int[3];

		while (run) {
			System.out.println("1.학생점수 입력 2.최고점수 3.평균 4.합계점수 5. 종료");
			System.out.print("선택하세요 > ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 학생점수입력.
				for (int i = 0; i < scores.length; i++) {
					System.out.print("점수를 입력하세요 > ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				System.out.println("입력완료");
				break;

			case 2:// 최고점 출력.
				int max = 0;
				// 반복문.
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max)
						max = scores[i];
				}
				System.out.printf("최고점은 %d입니다.\n", max);
				break;
			case 3: // 합계, 평균
				int sum = 0;
				double avg = 0; // 34.5555

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avg = sum / scores.length;
				System.out.printf("합계는 %d, 평균은%f입니다.\n", sum, avg);
				break;
			case 4:
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}
		}
		System.out.println("end of prog.");
	}// end of main
}// end of class