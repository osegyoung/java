package com.Yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add(null);
		strList.add("Hong");
		strList.add(new String("kildong"));// 문자열 객체 생산
		strList.add((new String(new byte[] { 77, 108, 108, 111, 96 })));

		strList.remove(0);// 제거
		strList.size();// 컬랙션 크기.

		strList.add(0, "Hello");
		strList.clear();

		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println(strList.contains("Hong"));

	}
}
