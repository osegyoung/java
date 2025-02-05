package com.Yedam.Interface;

public class Radio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Radio의 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Radio의 전원을 끕니다.");
		
	}

}
