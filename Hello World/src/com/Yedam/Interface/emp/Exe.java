package com.Yedam.Interface.emp;

import java.util.ArrayList;
import java.util.List;

import com.Yedam.inheritance.ComFriend;
import com.Yedam.inheritance.Friend;
import com.Yedam.reference.Student;

/*
 * String[] strAry;
 * Collection 1) List 2) Set 3) Map
 */

public class Exe {
	public static void main(String[] args) {
		System.out.println("홍길동".indexOf("홍")); // -1보다 큰 값.

		// 학생정보를 저장하는 컬렉션(ArrayList) 선언.
		// 3명 추가.
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("홍길동", 80, 90));
		students.add(new Student("김민수", 70, 90));
		students.add(new Student("박성용", 100, 95));

		// 삭제
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentName().equals("김민수")) {
				// student[i]
				students.remove(i);
			}
		}

		// 출력. 이름만 출력하기
		for (int i = 0; i < students.size(); i++) {
			System.out.println("이름: " + students.get(i).getStudentName());// 하나씩 값을 가져올때(get)사용
		}
	}

	void method() {
		String[] strAry = new String[10]; // 배열
		List<String> strList = new ArrayList<String>(); // 컬렉션.
		List<Friend> friends = new ArrayList<Friend>(); // 컬렉션.

		friends.add(new Friend("홍길동", "010-2222-3333"));
		friends.add(new ComFriend("김길동", "010-2222-4444", "국민은행", "신용보증팀"));

		friends.remove(new Friend("홍길동", "010-2222"));
		System.out.println("friends크기: " + friends.size());

		System.out.println(friends.get(1).getFriendName());
		// 추가.
		strList.add("안녕하세요");
		strList.add("Hello");
		strList.add("반갑습니다.");
		System.out.println("strList크기: " + strList.size());

		// 삭제.
		strList.remove(0);
		strList.remove("Hello");
		System.out.println("strList크기: " + strList.size());

		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));// 하나씩 값을 가져올때(get)사용
		}

	}
}
