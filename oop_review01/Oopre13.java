package com.our.oop_review01;


//	싱글쓰레드와 멀티쓰레드
public class Oopre13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i <300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.print("소요시간 1 : " + (System.currentTimeMillis()- startTime));
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.print("소요시간 2 : " + (System.currentTimeMillis() - startTime));
	}

}
