package com.our.oop_review01;

public class Oopre06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// �����ε�
		//	�����ε� �ʼ� ����
		// 	1. �޼��� �̸��� ���ƾ��Ѵ� 				-> add�� ����
		//	2. �Ű����� ���� �Ǵ� Ÿ���� �޶�� �Ѵ� 		-> Ÿ���� �ٸ����ϰ� �迭�� ������ �ٸ�����
		//	3. ��ȯ Ÿ���� �������
		
		MyMath3 m03 = new MyMath3();
		System.out.println("m03.add (3,3) ��� : " + m03.add(3,3));
		System.out.println("m03.add (3L,3L) ��� : " + m03.add(3L,3L));
		
		
		int[] a = {3,3};									// resultl �迭 �����ε� �� �������ֱ�
		System.out.println("m03.add(a) ��� : " + m03.add(a));	

		
		
		
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
	
	int add(int[] a) {								// �迭 �����ε� ���
		System.out.print("int add(int[] a) - ");	
		int result = 0;								// result ���� �� �ʱ�ȭ
		for (int i=0; i<a.length; i++) {			// result ���� 3�� �� ���ϱ�
			result += a[i];
		}
		return result;
	}
	int add(long[] b) {								// �迭 �����ε� ���
		System.out.print("int add(int[] a) - ");	
		int result = 0;								// result ���� �� �ʱ�ȭ
		for (int i=0; i<b.length; i++) {			// result ���� 3�� �� ���ϱ�
			result += b[i];
		}
		return result;
	}
	
}
