package com.Yedam.reference;

import java.util.Scanner;

/*
 * <<도서명, 저자, 출판사, 판매가격 >> 
 * 
 */
public class BookExe {
	static Book[] bookRepository = new Book[100];

	public static void init() {
		bookRepository[0] = new Book("자바다", "신용권", "한빛미디어", 30000);
		bookRepository[1] = new Book("자바의 기초", "홍길동", "한빛미디어", 20000);
		bookRepository[2] = new Book("자바의 기초", "홍길동", "한빛미디어", 20000);
	}// end of init()

	// 목록출력.
	public static void printList() {
		System.out.println("도서명  저자  가격");
		System.out.println("===============");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null) {
				System.out.println(bookRepository[i].showBookInfo());
			}
		}
		System.out.println("===============");
	}// end of printList()

	static Scanner scn = new Scanner(System.in);

	// 도서등록
	public static void addBook() {
		System.out.println("도서명을 입력하세요 : ");
		String name = scn.nextLine();
		System.out.println("저자를 입력하세요 : ");
		String author = scn.nextLine();
		System.out.println("출판사를 입력하세요 : ");
		String press = scn.nextLine();
		System.out.println("가격을 입력하세요 : ");
		int price = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] == null) {
				bookRepository[i] = new Book(name, author, press, price);
				System.out.println("등록완료.");
				break;// for 종료.
			}
		}
	}// end of addBook()

	// 목록(출판사)
	public static void searchList() {
		System.out.println("출판사를 입력하세요 : ");
		String press = scn.nextLine();

		System.out.println("도서명  저자  가격");
		System.out.println("===============");
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookPress().equals(press)) {

				System.out.println(bookRepository[i].showBookInfo());
			}
		}
		System.out.println("===============");
	}// end of searchList()

	public static void modifyBook() {
		System.out.println("도서명을 입력하세요 : ");
		String name = scn.nextLine();
		System.out.println("가격을 입력하세요 : ");
		int price = Integer.parseInt(scn.nextLine());

		// 도서명으로 검색 => 입력받은 값으로 수정
		boolean ixExist = false;//
		for (int i = 0; i < bookRepository.length; i++) {
			if (bookRepository[i] != null && bookRepository[i].getBookName().equals(name)) {
				bookRepository[i].setBookPrice(price);
				System.out.println("수정완료");
				ixExist = true;
				break; // 수정 완료시 반복문 종료
			}

		} // end of for.
		if (!ixExist) {
			System.out.println("찾는 도서가 없습니다.");
		}
	}// end of modifyBook()

	public static void showDetail() {
		System.out.println("도서명을 입력하세요 : ");
		String name = scn.nextLine();
		Calculator cal = new Calculator();
		cal.getBookInfo(name, bookRepository).showDetailInfo();

//		for (int i = 0; i < bookRepository.length; i++) {
//			if (bookRepository[i] != null && bookRepository[i].getBookName().equals(name)) {
//				bookRepository[i].showDetailInfo();//상세출력.
//				break;
//			}
//		}
		System.out.println("===========================================");
	}// end of showDetail

	public static void main(String[] args) {
		init(); // 기초데이더 생성

		boolean run = true;

		// 1.전체목록 2.도서등록 3.조회(출판사) 9.종료

		while (run) {
			System.out.println("1.전체목록 2.도서등록 3.조회(출판사) 4.금액수정 5.상세조회 9.종료");
			System.out.printf("선택하세요 > ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 목록출력, 도서명, 저자, 가격
				printList();
				break;

			case 2:
				addBook();
				break;

			case 3:
				searchList();
				break;

			case 4:// 금액수정
				modifyBook();
				break;

			case 5: // 상세조회.
				showDetail();
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}// end of swich

		} // end of while

		System.out.println("end of prog");

	}// end of main
}// end of class
