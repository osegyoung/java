package com.Yedam.API;

public class Member {
	String memberId;
	int memPoint;

	Member(){}
	
	Member(String id, int point) {
		memberId = id;
		memPoint = point;
	}

	@Override
	public int hashCode() {
//		return super.hashCode(); //Object의 hashcode는 주소값.
		return memPoint;
	}

	@Override
	public boolean equals(Object obj) {
		// memberId같을 경우 놀리적으로는 같은 객체.
		if (obj instanceof Member) {

			Member m2 = (Member) obj;
			if (this.memberId == m2.memberId && this.memPoint == m2.memPoint) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memPoint=" + memPoint + "]";
	}
	
}
