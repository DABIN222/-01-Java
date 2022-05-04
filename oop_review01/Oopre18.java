package com.our.oop_review01;


//	접근제어자 예제



class  MyParent {
	private int prv;					//	같은 클래스
			int dft;					//	같은 패키지
	protected int prt;					//	같은 패키지 + 자손(다른 패키지)
	public int pub;						//	접근제한 없음
	
	public void printMembers() {
		System.out.println(prv);		//	OK
		System.out.println(dft);		//	OK
		System.out.println(prt);		//	OK
		System.out.println(pub);		//	OK

	}
	
	
	
}

public class Oopre18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyParent p = new MyParent();
//		System.out.println(p.prv);		//	에러. 접근 범위가 안맞음
		System.out.println(p.dft);		//	OK
		System.out.println(p.prt);		//	OK
		System.out.println(p.pub);		//	OK
		
		
		
	}

}
