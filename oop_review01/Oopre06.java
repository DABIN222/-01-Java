package com.our.oop_review01;

public class Oopre06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 오버로딩
		//	오버로딩 필수 조건
		// 	1. 메서드 이름이 같아야한다 				-> add로 통일
		//	2. 매개변수 개수 또는 타입이 달라야 한다 		-> 타입을 다르게하고 배열은 개수를 다르게함
		//	3. 반환 타입은 영향없다
		
		MyMath3 m03 = new MyMath3();
		System.out.println("m03.add (3,3) 결과 : " + m03.add(3,3));
		System.out.println("m03.add (3L,3L) 결과 : " + m03.add(3L,3L));
		
		
		int[] a = {3,3};									// resultl 배열 오버로딩 값 지정해주기
		System.out.println("m03.add(a) 결과 : " + m03.add(a));	

		
		
		
	}

}
class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	} 
	
	long add (long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {								// 배열 오버로딩 사용
		System.out.print("int add(int[] a) - ");	
		int result = 0;								// result 변수 값 초기화
		for (int i=0; i<a.length; i++) {			// result 변수 3개 값 더하기
			result += a[i];
		}
		return result;
	}
	int add(long[] b) {								// 배열 오버로딩 사용
		System.out.print("int add(int[] a) - ");	
		int result = 0;								// result 변수 값 초기화
		for (int i=0; i<b.length; i++) {			// result 변수 3개 값 더하기
			result += b[i];
		}
		return result;
	}
	
}
