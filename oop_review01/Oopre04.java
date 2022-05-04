package com.our.oop_review01;

public class Oopre04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// p.254 메서드 생성 및 호출
		
		gugu gu = new gugu();		//객체호출(메서드호출)
		gu.gugudan(1);				//이런 형식으로
	
		
	}

}

class gugu {
	void gugudan(int dan) {
		for (int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d%n", dan,i,dan*i);
		}
		return;
	}
}