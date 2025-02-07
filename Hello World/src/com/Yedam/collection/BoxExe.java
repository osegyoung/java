package com.Yedam.collection;

class Box<E> {
	E item;

	void setItem(E item) {
		this.item = item;
	}

	E getItem() {
		return item;
	}
}

public class BoxExe {
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		
//		box.setItem("오렌지");
		box.setItem(100);
		
		Object result = box .getItem();// Object -> String		
	}
}
