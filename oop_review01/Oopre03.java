package com.our.oop_review01;

public class Oopre03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// 배열시 // 	class이름 변수이름 = new class 이름[길이]
		Tv03 tvArr[] = new Tv03[3];
		
		for (int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv03();			//  객체 생성해서 배열을 각 요소에 저장 꼭 해줘야함
			tvArr[i].channel = i+10;
			System.out.printf("tvArr[%d].channel = %d%n",i,tvArr[i].channel);
		}
		
		
		
	}

}


class Tv03{
	// 속성(변수) 설정
	int channel;
	
	// 기능(메소드) 설정
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
}