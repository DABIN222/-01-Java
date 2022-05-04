package com.our.oop_review01;

public class Oopre07 {

	public static void main(String[] args) {
		
		// 생성자 안에서 다른 생성자 호출하기
		
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.printf("c1의 color =" + c1.color +  ", gearType = " + c1.gearType +  ", door = " + c1.door);
		System.out.printf("%nc2의 color =" + c2.color +  ", gearType = " + c2.gearType +  ", door = " + c2.door);
		


		
	}
	
}

class Car {
	String color;		//	차 색상
	String gearType;	//	변속기 종류 - auto(자동), manual(수동)
	int door;			//	문의 개수
	
	//	생성자 만들기
	Car() {								//car 1만들기, 초기값 그대로가지는 친구로
		this ("white", "auto", 4);
	}
	
	Car(String color) {					//car 2 만들기, 옵션동일, 차 색상만 바뀌는 친구로
		this (color, "auto", 4);
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
	
}
