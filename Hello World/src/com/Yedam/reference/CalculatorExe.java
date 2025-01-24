package com.Yedam.reference;

public class CalculatorExe {
	public static void main(String[] args) {Book[] bookStore = { new Book("이것이 자바다", "신용권", "한빛미디어", 10000), 
			new Book("자바스크립트", "김자바", "저버출판사", 15000),
			new Book("혼자공부하는자바", "혼공자", "한빛미디어", 20000), 
			new Book("혼자공부CSS", "혼공자", "한빛미디어", 20000),
			new Book("혼자공부HTML", "혼공자", "한빛미디어", 20000) 
			};
		Calculator cal = new Calculator ();
		cal.showCalendar();
//		Book author = cal.getBookInfo("혼자공부CSS",bookStore);
//		if(author != null ) {
//			author.showDetailInfo();
////			System.out.println(author.getBookName() + "," + author.getBookAuthor());
//		}else {
//			System.out.println("조회 결과가 없음.");
//		}
//		
		
//		int[] randomA = cal.randomAry(3);
//		for(int num : randomA) {
//			System.out.println(num);
//		}
////		System.out.println(cal.sum(randomA));
//		
//		int[] ary1 = { 14,23,11,14,24};
//		int[] ary2 = { 33,23,6,12,9};
//		
//		int max = cal.getMax(cal.sum(ary1),cal.sum(ary2));
//		System.out.println("배열의 합 " + max);
//		
////		Calculator cal = new Calculator();
////		cal.printStar(4);//매개값.
//		
//		double result = cal.sum(10.5, 20);
////		//double >float > long > int > short > byte
//		result = cal.sum(new int[] { 10, 20, 30, 40 });
//		System.out.println("결과: " + result);
		
		
		
		
	}
}
