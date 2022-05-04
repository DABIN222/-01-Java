package com.our.oop_review01;



public class Oopre02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tv01 t1 = new Tv01();
		Tv01 t2 = new Tv01();
		
		
		
		
		t1.channel = 0;
		t2.channel = 0;
		System.out.printf("t1의 channel은 %d 입니다.%n",t1.channel);
		System.out.printf("t2의 channel은 %d 입니다.%n",t2.channel);
		
		t1.channel  = 7;
		System.out.printf("t1의 channel을 %d 로 변경하였습니다.%n",t1.channel);
		System.out.printf("t1의 channel은 %d 입니다.%n",t1.channel);

		t1.channel  = 0;
		System.out.printf("t2의 channel은 %d 입니다.%n",t2.channel);

		
	}

}


class Tv01 {
	// 속성(변수) 먼저 정의
	int channel;
	
	
	// 메서드(기능) 정의
	void ChannelUp() {
		++channel;
	}
	
	void ChannelDown() {
		--channel;
	}
	
	
	
}
