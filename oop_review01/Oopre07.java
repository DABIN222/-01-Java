package com.our.oop_review01;

public class Oopre07 {

	public static void main(String[] args) {
		
		// ������ �ȿ��� �ٸ� ������ ȣ���ϱ�
		
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.printf("c1�� color =" + c1.color +  ", gearType = " + c1.gearType +  ", door = " + c1.door);
		System.out.printf("%nc2�� color =" + c2.color +  ", gearType = " + c2.gearType +  ", door = " + c2.door);
		


		
	}
	
}

class Car {
	String color;		//	�� ����
	String gearType;	//	���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;			//	���� ����
	
	//	������ �����
	Car() {								//car 1�����, �ʱⰪ �״�ΰ����� ģ����
		this ("white", "auto", 4);
	}
	
	Car(String color) {					//car 2 �����, �ɼǵ���, �� ���� �ٲ�� ģ����
		this (color, "auto", 4);
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
	
}
