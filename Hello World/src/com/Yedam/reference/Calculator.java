package com.Yedam.reference;

public class Calculator {
	// 1월달 출력.
	public void showCalendar() {
		String[] days = {"Sun","Mon","Tue","Wen","Thr","Fri","Sat"};
		for(String day : days) {
			System.out.printf("%4s",day);
		}
		System.out.println("\n---------------------------------");
		//공백,말일 계산.
		int spaces = 6;
		for(int i=0;i<spaces;i++) {
			System.out.printf("%4s"," ");
		}
	
		int lastDay = 31;
		for(int i=1;i<=lastDay;i++) {
			System.out.printf("%4d",i);
			if((i + spaces) % 7 ==0) {
				System.out.println();
			}
		}
		System.out.println("\n---------------------------------");
	}
}
		
		
		
		
		
		
		
		
		

//	public Book getBookInfo(String bookName, Book[] bookAry) { // 무조건 반환 해줘야함.
////		Book[] bookStore = { new Book("이것이 자바다", "신용권", "한빛미디어", 10000), 
////				new Book("자바스크립트", "김자바", "저버출판사", 15000),
////				new Book("혼자공부하는자바", "혼공자", "한빛미디어", 20000), 
////				new Book("혼자공부CSS", "혼공자", "한빛미디어", 20000),
////				new Book("혼자공부HTML", "혼공자", "한빛미디어", 20000) 
////				};
//		// 배열검색
//		for (int i = 0; i < bookAry.length; i++) {
//			if (bookAry[i].getBookName().equals(bookName)) {
//				return bookAry[i];
//			}
//		}
//		return null;
//	}
//
//	// 1~100 사이의 임의값을 n개 반환.
//	public int[] randomAry(int n) {
//		int[] result = new int[n];
//		for (int i = 0; i < result.length; i++) {
//			result[i] = (int) (Math.random() * 100) + 1;
//
//		}
//		return result;
//	}
//
//	public int getMax(int num1, int num2) {
//		return num1 > num2 ? num1 : num2;
//	}
//		if (num1 > num2) {
//			return num1;
//		}else {
//		return num2;
//		}
//	}
//
//	public void printStar(int times) {
//		for (int i = 1; i <= times; i++) {
//			printStar(i, "★");
//			System.out.println();
//		}
//	}
//
//	// 별 모양을 출력하는 메소드.
//	public void printStar(int times, String types) {// 매개변수
//		for (int i = 1; i <= times; i++) {
//			System.out.print(types);
//		}
//	}
//
//	// 두수의 합을 반환.
//	public int sum(int num1, int num2) {
//
//		return num1 + num2;
//	}
//
////동일한 메소드명을 중복정의: overloading
//	public double sum(double num1, double num2) {
//		return num1 + num2;
//	}
//
//	public int sum(int[] intAry) {
//		int sum = 0;
//		for (int i = 0; i < intAry.length; i++) {
//			sum += intAry[i];
//
//		}
//		return sum;
//	}
//}// end of class
