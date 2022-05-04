package com.our.oop_review01;

//	super() ������ ������ ����ϱ�



class Point16 {
	int x,y;
	
	Point16 (int x, int y){
		this.x = x;									//	�����ʱ�ȭ
		this.y = y;
	}
	
	String getLocation() {
		return "x: " +x+ ", y: "+y;
	}
}


class Point163D extends Point16{
	int z;
	
	Point163D (int x, int y, int z) {
		super(x,y);									//	super���
		this.z=z;
	}
	
	String getLocation() {							//	�������̵�
		return "x: " +x+ ", y: "+y+ ", z: " +z;
	}
}



public class Oopre16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point163D p3= new Point163D(1,2,3);
	}

}
