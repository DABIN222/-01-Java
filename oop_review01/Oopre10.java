package com.our.oop_review01;


//	p.315 예제 7-1 / 상속



class Tv10 {
	//	속성(변수) 설정
	boolean power;
	int channel;
	
	//	기능(메소드) 설정
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv10{
	//	속성(변수) 설정
	boolean caption;							// 캡션 상태(onoff)
	
	//	기능(메서드) 설정
	void displayCaption(String text) {
		if(caption) {							// 만약 caption상태면
			System.out.println(text);			// text 출력
			
		}
	}
}


public class Oopre10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaptionTv ctv =new CaptionTv();
		ctv.channel = 10;
		System.out.println(ctv.channel);
		ctv.channelUp();
		System.out.println(ctv.channel);

		ctv.displayCaption("Hello, Wolrd");		// true임을 지정해주지 않아 작동 X
		ctv.caption = true;
		ctv.displayCaption("Hello, Wolrd");		// true이기에 text값 출력
		
		
	}
}
