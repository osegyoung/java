package com.Yedam.Interface;
/*
 *
 * 인터페이스
 * 필드,
 */

public interface RemoteControl {
	public int Max_VOLUME = 10; // 상수
	public int Min_VOLUME = 0; // 상수
	
	public void turnOn();//추상메소드(기능정의)
	public void turnOff();
	

}
