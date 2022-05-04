
//	p.318 예제 7-2 해보기
package com.our.oop_review01;



class Shape {
	//	(속성)변수설정
	String color = "black";
	
	//	(끼능)메서드설정
	void draw() {
		System.out.printf("[color = %s]%n, color");			//	%s = String으로 출력
	}	
}


class Point {
	//	(속성)변수설정
	int x;
	int y;
	
	//	(기능)메서드설정
	Point(int x, int y){									
		this.x = x;
		this.y = y;
	}
	
	Point(){
		this(0,0);
	}
	
	String getXY() {
		return  "("+x+", "+y+")";
	}	
}

class Circle extends Shape {
	//	(속성)변수설정
	Point center;		//	원의 원점 좌표
	int r;				//	반지름
	
	Circle(){
		this (new Point(0,0),100);
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("[center = (%d, %d), r = %d, color = %s]%n", center.x, center.y, r, color);
	}
	
}

class Triangle extends Shape {

	//	변수 설정
	Point [] p = new Point[3];
	
	//	메소드 설정
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
		
		
	}
	
}






public class Oopre11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point[] p = {
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)
		};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150), 50);
		
		t.draw();
		c.draw();
		
		
	}

}
