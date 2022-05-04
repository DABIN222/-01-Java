package com.our.oop_review01;

class Point15{
	int x;
	int y;

	//	더쉽게 호출하기
	Point15(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//	Object클래스의 toStrinng()을 오버라이딩
	public String toString() {
		return "x: "+x+", y: "+y;
	}
}


public class Oopre15_easily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Point15 p = new Point15();
		Point15 p = new Point15(3,5);
		
//		p.x = 3;
//		p.y = 5;
		//	이렇게하는게 아니라
//		System.out.println("p.x = "+p.x);
//		System.out.println(p.toString());
//		
		//	더간단히, toString은 밑과 같다.
		System.out.println(p);
	}

}
