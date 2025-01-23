package com.Yedam.reference;

public class ReferenceExe2 {

	public static void main(String[] args) {

		// String[][] strArray =
		// {{"홍길동","80"},{"김민수","85"},{"박헌수","88"},{"심상현","90"},{"최기동","75"}};

		String[][] strArray = new String[5][2];
		strArray[0][0] = "홍길동";
		strArray[0][1] = "80";
		strArray[1][0] = "김민수";
		strArray[1][1] = "85";
		strArray[2][0] = "박헌수";
		strArray[2][1] = "88";
		strArray[3][0] = "심상현";
		strArray[3][1] = "90";
		strArray[4][0] = "최기동";
		strArray[4][1] = "75";

		int sum = 0;
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("점수 =>" + strArray[i][1]);// 점수 부분만 들고오고 싶을때

			// sum값을 누적.
			sum = sum + Integer.parseInt(strArray[i][1]);
			System.out.printf("sum의 값은 %d\n", sum);

			int max = 0;

			for (int j = 0; j < strArray.length; j++) {
				if (strArray[i][1] != null) {
					int fff = Integer.parseInt(strArray[i][1]);
					if (max < fff) {
						max = fff;
						
					}
					
				}
				System.out.printf("최고점수는 %s 입니다.\n", max);
			}
		}
		

	}// end of main
}// end of class
