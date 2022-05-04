package com.our.oop_review01;


//	접근제어자 2

class MyChild extends MyParent{
	public void printMembers() {
//		System.out.println(prv);		//	OK
		System.out.println(dft);		//	OK
		System.out.println(prt);		//	OK
		System.out.println(pub);		//	OK

	}
}



public class Oopre19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=22222222;
		System.out.println(i);
	}

}
