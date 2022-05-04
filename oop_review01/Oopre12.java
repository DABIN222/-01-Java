package com.our.oop_review01;

//	포함과 상속 차이보기

//	상속

class Point12 extends Object{					//	자동으로 Object가 조상이된다.
	int x;
	int y;
}

class Circle12 extends Point12{
	int r;
}


// 포함 - 참조변수의 초기화

class Circle1212 {
	Point12 p = new Point12();					//	꼭 new해줘야 저장공간이 생김 초기화 필수
	int z;
	
}


public class Oopre12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle12 c = new Circle12();
		
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x = " + c.x);
//		System.out.println("c.y = " + c.y);
//		System.out.println("c.r = " + c.r);
//		
//		
//		Circle1212 cc = new Circle1212();
//		cc.p.x = 1;
//		cc.p.y = 2;
//		cc.z = 3;
//		System.out.println("cc.p.x = " + cc.p.x);
//		System.out.println("cc.p.y = " + cc.p.y);
//		System.out.println("cc.z = " + cc.z);
		
		System.out.println(c.toString());		//
		System.out.println(c);					//	이렇게 해도 이렇게 출력된다
		
		Circle12 c2 = new Circle12();
		System.out.println(c2.toString());
	}

}
