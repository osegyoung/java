package com.Yedam.API;

public class StringUtil {


	static void checkGender(String ssn) {
		// 성별을 출력. "남자입니다." 또는 "여자 입니다."
		String ssn1 = "010624-1230123";
	int pos = 6;
		if(ssn.length() == 14) {
		pos =7;
	}
		char chr = ssn.charAt(pos);
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
				System.out.println("잘못입력했습니다.");

		}

	}


	static void chechExtesion(String file) {
		// 파일의 확장자는 jpg (또는 mp3, hwp)입니다.
		String ext = file.substring(file.indexOf(".") +1);
				System.out.printf("파일의 확장자는 %s 입니다.", ext);

	}

	static void getLength(String str) {
		// 문장의 길이는 7글자입니다.
		
		int len = str.trim().length();
			System.out.printf("문장의 길이는 %d글자입니다.", len);					
	}
}
