package com.our.oop_review01;

public class Oopre08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//	������ ����ؼ� ��ü(�ν��Ͻ�) �����ϱ�
		
		
		Car07 c1 = new Car07();
		Car07 c2 = new Car07(c1);
		System.out.println("c1 �� color : " + c1.color + ", gearType : " + c1.gearType + ", door : "+c1.door);
		System.out.println("c2 �� color : " + c2.color + ", gearType : " + c2.gearType + ", door : "+c2.door);

		c1.door = 100;
		c1.color = "blue";
		System.out.println("c1 ���� �� ");
		System.out.println("c1 �� color : " + c1.color + ", gearType : " + c1.gearType + ", door : "+c1.door);
		System.out.println("c2 �� color : " + c2.color + ", gearType : " + c2.gearType + ", door : "+c2.door);

		//	���
		//	�ν��Ͻ� c2�� c1�� �����Ͽ� ������ ���̹Ƿ� ���� ���¸� ������
		//	���� ���������� �޸𸮰����� �����ϹǷ� c1 ���� ����Ǿ c2�� ������ ���� �ʴ´�.
		
		
		
	}

}

class Car07{
	
	//	�Ӽ�(����) ��������
	
	String color;
	String gearType;
	int door;
	
	//	������ ȣ��
	//	�ʱⰪ ����, �׷��� �ڿ� ���� �־��ִ°� �־����
	Car07 () {
		this("white", "auto", 4);
	}
	
	//	��ü ���縦 ���� ������
	Car07(Car07 c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;	
	}

	//	������ ����?
	Car07 (String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
		
		
	
	
	
}