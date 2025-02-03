package com.Yedam.reference;

public class MemberExe {

	// 싱글톤객체 생성
	// 1. 필드를 static 선언.
	private static MemberExe instance = new MemberExe();// static 필드
	
	// 2.생성자 은닉.
	private MemberExe() {
	}
		// 3. 인스턴스를 제공해주는 메소드. getINstance();
		public static MemberExe getInstance() {
			return new MemberExe();
	}
	

	static Member[] members = { new Member("user01", "1111", "홍길동"), new Member("user02", "2222", "김민수"),
			new Member("user03", "3333", "박석민") 
	};

//기본생성장.MemberExe(){}
	public static String login(String id, String password) {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId().equals(id)
					&& members[i].getPassword().equals(password)) {

				return members[i].getMemberName(); // id, password 일치.
			}

		}
		return null; // 일치하는 값이 없음.
	}// end of login()
	
}
