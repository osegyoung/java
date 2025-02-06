package com.Yedam.API;

public class StringExam {
	public static void main(String[] args) {
		// 문제호출
		연습();
	}
	static void 연습() {
		String str = "hello";
		String str1 = "world";
	
	}
	
	static void no1() {
		String ssn1= "9803061234123";
				String ssn2= "010926 1596478";
				String ssn3= "980306-1234123";
	}
	static void no2() {
		String file1 = "C:/temp/flower.jpg";
		String file2 = "D:/web/project/guide.mpeg";
		StringUtil.chechExtesion(file2);
	}
	static void no3() {
		String str1 = " suggest ";
		String str2 = " currently ";
		String str3 = " particular ";
		StringUtil.getLength(str1);
	}
}
