package com.Yedam.reference;

public class Book {
	// 필드
	String bookName;
	String bookAuthor;
	String bookPress;
	int bookPrice;

	// public, defaul, private => 접근지시자(acess
	// 생성자
	Book(String bookName, String bookAuthor, String bookpress, int bookprice) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPress = bookpress;
		this.bookPrice = bookprice;
	}

	// 제목, 저자, 가격
	String showBookInfo() {
		return bookName + " " + bookAuthor + " " + bookPrice;
	}
	void showDetailInfo() {
		// 도서명 : 이것이 자바다      출판사: 한빛미디어
		// 저자 : 신용권             가격 : 25000
		String strFormat = "도서명: %10s\t출판사: %6s\n 저자: %3s\t\t가격: %5d 원\n";
		System.out.printf(strFormat,bookName,bookAuthor,bookPress, bookPrice);
	}

	void setBookPrice(int bookprice) {
		if (bookprice < 0) {
			this.bookPrice = 0;
			return;
		}
		this.bookPrice = bookPrice;
	}

	void setbookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public void setBookPress(String bookPress) {
		this.bookPress = bookPress;
	}
	
	public String getBookName() {
		return bookName;	
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public String getBookPress() {
		return bookPress;
	}

	public int getBookPrice() {
		return bookPrice;
	}
	
}// end of class
