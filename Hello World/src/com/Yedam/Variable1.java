package com.Yedam;

public class Variable1 {
	
	public static void main(string[] args) {
		// int(4byte)
		int num1 = 1101111;
		
		byte num2 = 27; //byte(1byte)
		short num3 = 128; //short(2byte)
		long num4 = 1111111111;
		System.out.println(Long.MAX_VALUE);
		
		byte num5 = 20;
		int result = (byte) (num2 + num5); //강제형변환(casting)
		int intResult = num1 + num5; // 자동형변환_promotion
		System.out.println(intResult);
		
		//데이터타입 변수이름 = 값
		int[] intAry = {10, 25, 82, 11};
		String[] strAry = {"Hong", "Park","Choid" };
		strAry[2] = "Kim";
		
		int[] anotherAry = new int[10]; // 크기 10으로 생성.
		for(int i = 0; i < anotherAry.length; i++) {
			anotherAry[i] = (int) (Math.random() * 100); 
		}
		
		//배열값을 출력.
		for(int num : anotherAry) {
		System.out.println(num);
		}
		
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("sum의 값은" + sum);
	}
}
