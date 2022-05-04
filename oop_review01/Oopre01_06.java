
package com.our.oop_review01;


class Oopre01_06 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	P.235 예제 6-1

		Tv t= new Tv();
		
		
		
		
		t.power = true;
		if(t.power == true) {
			System.out.println("On");
		}else {
			System.out.println("Off");
		}
		
		t.power();
		System.out.println(t.power);
		t.channel = 7;
		System.out.println(t.channel);
		t.channelUp();
		System.out.println(t.channel);
		t.channelDown();
		System.out.println(t.channel);
		
		
		
		
	}	
}


class Tv {
	
	// 속성(변수) 먼저 정의하기
	String color;
	int channel;
	boolean power;
	
	void power() {
		power = !power;			// 전원 on/off
	}

	void channelUp() {
		++channel;				// channel 올리기
	}
	
	void channelDown() {
		--channel;				// channel 내리기
	}
}
