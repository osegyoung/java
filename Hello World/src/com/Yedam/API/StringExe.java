package com.Yedam.API;

public class StringExe {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char chr = ssn.charAt(7);
		switch (chr) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("사람 아님.");
		}

		// String str = new String(매개값);byte[]
		String str = new String(new byte[] { 72, 101, 108, 108, 111 });
		System.out.println(str.charAt(0));

		byte[] result = str.getBytes(); // 문자열 => byte[] 반환.
		for (byte b : result) {
			System.out.println();
		}
	}
}



