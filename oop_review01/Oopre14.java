package com.our.oop_review01;


//	오버라이딩


class Point14{
	int x;
	int y;
	String getLocation() {
		return "x: "+x +", y:"+ y;
		//	return을 상속 받긴 받았지만 조상거를 안쓰고 자손거를 사용한 것이 오버라이딩
	}
}

class Point143D extends Point14{
	int z;
	String getLocation() {
		
		//	조상의 getLocation()을 오버라이딩
		//	z값도 출력될 수 있게 
		//	오버라이딩이 우선으로 호출된다.
		
		return "x: "+x +", y:"+ y +", z: "+z;
	}
}


public class Oopre14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point143D p = new Point143D();
		 
		p.x = 3;
		p.y = 5;
		p.z = 7;
		
		System.out.println(p.getLocation());
		
		
		
	}

}
