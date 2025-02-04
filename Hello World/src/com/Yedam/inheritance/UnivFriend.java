package com.Yedam.inheritance;

/*
 * 학교정보.
 */
public class UnivFriend extends Friend {
	// 필드
	private String univName;
	private String univMajor;

	// 생성자
	public UnivFriend(String friendName, String phoneNumber, String univName, String univMajor) {
		super( friendName,  phoneNumber);
		this.univName = univName;
		this.univMajor = univMajor;
	}
//showInfo(재정의) -> 학교정보추가
	@Override
	public String showInfo() {
		return super.showInfo() + ",회사:" + univName;
	}
	
	// getter, setter

	public String getUnivName() {
		return univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public String getUnivMajor() {
		return univMajor;
	}

	public void setUnivMajor(String univMajor) {
		this.univMajor = univMajor;
	}

}
