package com.Yedam.inheritance;

/*
 * Friend 상속하는 ComFriend.
 * 회사명, 부서정보.
 */
public class ComFriend extends Friend {
	//필드
	private String company;
	private String position;

	// 생성자
	public ComFriend(String friendName, String phoneNumber, String company, String position){
		super(friendName, phoneNumber);
		this.company = company;
		this.position = position;
		
	}

// getter, setter
	public String getCompanyName() {
		return company;
	}

	public void setCompanyName(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return position;
	}

	public void setDepartment(String position) {
		this.position = position;
	}
}// end of class
