package com.our.oop_review01;

public class Oopre05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMath mm = new MyMath();
		
		int result1 = mm.add(3,5);				//메서드에서 매개변수를 넘겨받을 때, 3과 5를 인자라 부름
		int result2 = mm.subtract(5, 3);
		int result3 = mm.multiply(2, 4);
		int result4 = mm.devide(4, 2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4
				);

		
	}

}

class MyMath {
	
	int add (int x, int y) {					// 메서드 매개변수 x,y
		return x+y;
	}
	
	long add (long x, long y) {
		return x+y;
	}
	
	int subtract (int x, int y) {
		return x-y;
	}
	
	int multiply (int x, int y) {
		return x*y;
	}
	
	int devide (int x, int y) {
		return x/y;
	}
	
}
