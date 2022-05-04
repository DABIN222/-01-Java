package com.our.oop_review01;

public class Oopre08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//	생성자 사용해서 객체(인스턴스) 복사하기
		
		
		Car07 c1 = new Car07();
		Car07 c2 = new Car07(c1);
		System.out.println("c1 의 color : " + c1.color + ", gearType : " + c1.gearType + ", door : "+c1.door);
		System.out.println("c2 의 color : " + c2.color + ", gearType : " + c2.gearType + ", door : "+c2.door);

		c1.door = 100;
		c1.color = "blue";
		System.out.println("c1 변경 후 ");
		System.out.println("c1 의 color : " + c1.color + ", gearType : " + c1.gearType + ", door : "+c1.door);
		System.out.println("c2 의 color : " + c2.color + ", gearType : " + c2.gearType + ", door : "+c2.door);

		//	결론
		//	인스턴스 c2는 c1을 복사하여 생성된 것이므로 같은 상태를 갖지만
		//	서로 독립적으로 메모리공간이 존재하므로 c1 값이 변경되어도 c2는 영향을 받지 않는다.
		
		
		
	}

}

class Car07{
	
	//	속성(변수) 먼저지정
	
	String color;
	String gearType;
	int door;
	
	//	생성자 호출
	//	초기값 지정, 그러나 뒤에 값을 넣어주는걸 넣어야함
	Car07 () {
		this("white", "auto", 4);
	}
	
	//	객체 복사를 위한 생성자
	Car07(Car07 c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;	
	}

	//	생성자 지정?
	Car07 (String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
		
		
	
	
	
}