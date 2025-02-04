package com.Yedam.inheritance;

public class MysqlDao extends Dao{
	
	public void register() {
		System.out.println("등록가능.");
	}
	public void remove() {
		System.out.println("삭제기능.");
	}

	public void search() {
		System.out.println("조회가능.");
	}
}//end of class
