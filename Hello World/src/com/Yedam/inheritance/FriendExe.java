package com.Yedam.inheritance;

import java.util.Scanner;

/*
 * 친구목록, 등록, 수정, 삭제.
 * 수정: 이름, 연락처 입력
 */
public class FriendExe {
	// 싱글톤.
	// 1. 필드선언.
	private static FriendExe instance = new FriendExe();

	// 2. 생성자 은닉.
	private FriendExe() {
	}

	// 3. 인스턴스를 반환하는 메소드.
	public static FriendExe getInstance() {
		return instance;
	}

	Friend[] friends = new Friend[100]; // 저장공간.
	// 초기데이터

	public void init() {
		friends[0] = new Friend("홍길동", "010-1111-2222");
		friends[1] = new UnivFriend("김민식", "010-2222-3333", "우리대학교", "복지학과");
		friends[2] = new ComFriend("박석민", "010-4444-5555", "인포젠", "");
	}

	Scanner scn = new Scanner(System.in);

	// 시작메소드.
	public void run() {
		init();

		boolean run = true;
		while (run) {
			System.out.println("1.친구목록 2.등록 3.수정. 4.삭제 9.종료");
			System.out.println("메뉴선택 > ");
			int menu = scn.nextInt();
			switch (menu) {
			case 1: // 목록
				friendList();
				break;

			case 2: // 등록
				addFriend();
				break;

			case 3: // 수정
				editfriend();
				break;

			case 4: // 삭제
				delfriend();
				break;

			case 9: // 종료
				System.out.println("종료합니다.");
				run = false;
			default:
				System.out.println("메뉴를 확인하세요");
			}
		}

	}// end of run()

	// 추가메소드.
	void friendList() {
		System.out.println("친구목록");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].showInfo());

//				if (friends[i] instanceof Friend) {
//					System.out.println("이름:" + friends[i].getFriendName());
//				} else if (friends[i] instanceof UnivFriend) {
//
//				} else if (friends[i] instanceof ComFriend) {

//				}
			}
		
		}
	}

	// 친구: 이름,연락처
	// 학교: 친구 + 학교명, 전공
	// 회사: 친구 + 회사명, 부서.
	void addFriend() {
		System.out.println("1.친구 2.학교친구 3.회사친구 4.종료");
		System.out.print("선택하세요>> ");
		int choice = scn.nextInt();

		// 이름,연락처.
		String name = "";
		while (true) {
			System.out.print("이름입력 >> ");
			name = scn.nextLine();
			// 이름의 정상값의 범위.
			if (name.length() >= 2 && name.length() <= 10) {
				break;
			} else {
				System.out.print("이름은 2글자 이상 10글자 이하 ");

			}
		} // end of while
		System.out.print("연락처입력 >> ");
		String phone = scn.nextLine();

		Friend friend = null;
		String univ = null, major = null, company = null, position = null;
		if (choice == 1) {
			friend = new Friend(name, phone);

		} else if (choice == 2) {// 학교,전공.
			System.out.print("이름입력 >> ");
			univ = scn.nextLine();
			System.out.print("연락처입력 >> ");
			major = scn.nextLine();
			friend = new UnivFriend(name, phone, univ, major);

		} else if (choice == 3) {
			System.out.print("회사이름입력 >> ");
			company = scn.nextLine();
			System.out.print("직위입력 >> ");
			position = scn.nextLine();
			friend = new ComFriend(name, phone, company, position);

		} else {
			System.out.println("잘못입력했습니다.");
			return;

		}

		// 빈공간에 저장
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null)
				;
			friends[i] = friend;
			System.out.println("등록완료");
			break;
		}

	}// end off addFriend()

	void editfriend() {
		System.out.println("친구수정");
		// 친구연락처 변경.
		System.out.println("수정할 이름을 입력하세요");
		String name = scn.nextLine();
		System.out.println("새로운 연락처를 입력하세요");
		String phone = scn.nextLine();

		boolean isExist = false;

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getFriendName().equals(name)) {
				friends[i].setPhoneNumber(phone);
				System.out.println("수정완료");
				isExist = true;
				break;
			}
		} // end of for

		if (!isExist) {
			System.out.println("없음.");
		}
	}// end of editFriend()

	void delfriend() {
		System.out.println("삭제할 이름을 입력하세요");
		String name = scn.nextLine();

		boolean isExist = false;

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getFriendName().equals(name)) {
				friends[i] = null;
				System.out.println("수정완료");
				isExist = true;
				break;
			}
		} // end of for
		if (!isExist) {
			System.out.println("없음.");
		}
	}
}// end of class
