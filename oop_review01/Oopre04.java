package com.our.oop_review01;

public class Oopre04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// p.254 �޼��� ���� �� ȣ��
		
		gugu gu = new gugu();		//��üȣ��(�޼���ȣ��)
		gu.gugudan(1);				//�̷� ��������
	
		
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