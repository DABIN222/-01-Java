package com.our.oop_review01;

//	���԰� ��� ���̺���

//	���

class Point12 extends Object{					//	�ڵ����� Object�� �����̵ȴ�.
	int x;
	int y;
}

class Circle12 extends Point12{
	int r;
}


// ���� - ���������� �ʱ�ȭ

class Circle1212 {
	Point12 p = new Point12();					//	�� new����� ��������� ���� �ʱ�ȭ �ʼ�
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
		System.out.println(c);					//	�̷��� �ص� �̷��� ��µȴ�
		
		Circle12 c2 = new Circle12();
		System.out.println(c2.toString());
	}

}
