package com.Yedam.reference;

import java.util.Scanner;

/*
 * <<도서명, 저자, 출판사, 판매가격 >> 
 * 
 */
public class BookExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Book[] bookRepository = new Book[100];
		//1.전체목록 2.도서등록 3.조회(출판사) 9.종료
		boolean run = true;
		
		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 9.종료");
			System.out.printf("선택하세요 > "  );
			int fff = Integer.parseInt(scn.nextLine());
			
			
			switch (fff) {
			case 1: 
				System.out.println("책 제목   출판사");
				System.out.println("===============");
				for(int i = 0; i<bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						
						System.out.printf("도서명: %s - 출판사: %s ",bookRepository[i]);
					}
				}
				break;
				
			case 2:
				System.out.printf(" 책 제목,출판사를 입력하세요 : ");
				String bookName = scn.nextLine();
				for(int i = 0; i<bookRepository.length; i++) {
					if(bookRepository[i] == null) {
						
						break;
					}
				}
				break;
				
			case 3:
				System.out.print("출판사를 입력하세요 : ");
				String Book = scn.nextLine();
				for(int i = 0; i<bookRepository.length; i++) {
					if (bookRepository[i] != null) {
						if(bookRepository.equals(bookRepository[i])) {
						System.out.print("도서명: %s - 출판사: %s");
						}
					}
				}
				
				
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
			run = false;
			}//end of swich
	
		}//end of while
		
		System.out.println("end of prog");
		
	}//end of main
}//end of class
