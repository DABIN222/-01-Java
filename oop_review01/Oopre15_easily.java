package com.our.oop_review01;

class Point15{
	int x;
	int y;

	//	������ ȣ���ϱ�
	Point15(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//	ObjectŬ������ toStrinng()�� �������̵�
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
		//	�̷����ϴ°� �ƴ϶�
//		System.out.println("p.x = "+p.x);
//		System.out.println(p.toString());
//		
		//	��������, toString�� �ذ� ����.
		System.out.println(p);
	}

}
