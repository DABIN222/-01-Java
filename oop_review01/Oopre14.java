package com.our.oop_review01;


//	�������̵�


class Point14{
	int x;
	int y;
	String getLocation() {
		return "x: "+x +", y:"+ y;
		//	return�� ��� �ޱ� �޾����� ����Ÿ� �Ⱦ��� �ڼհŸ� ����� ���� �������̵�
	}
}

class Point143D extends Point14{
	int z;
	String getLocation() {
		
		//	������ getLocation()�� �������̵�
		//	z���� ��µ� �� �ְ� 
		//	�������̵��� �켱���� ȣ��ȴ�.
		
		return "x: "+x +", y:"+ y +", z: "+z;
	}
}


public class Oopre14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point143D p = new Point143D();
		 
		p.x = 3;
		p.y = 5;
		p.z = 7;
		
		System.out.println(p.getLocation());
		
		
		
	}

}
