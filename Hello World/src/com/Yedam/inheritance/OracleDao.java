package com.Yedam.inheritance;

public class OracleDao extends Dao {

	public void register() {
		System.out.println("등록가능.");
	}

	public void remove() {
		System.out.println("삭제가능.");
	}

	public void search() {
		System.out.println("조회가능.");
	}

}
