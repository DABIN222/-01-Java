
package com.our.oop_review01;


class Oopre01_06 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	P.235 ���� 6-1

		Tv t= new Tv();
		
		
		
		
		t.power = true;
		if(t.power == true) {
			System.out.println("On");
		}else {
			System.out.println("Off");
		}
		
		t.power();
		System.out.println(t.power);
		t.channel = 7;
		System.out.println(t.channel);
		t.channelUp();
		System.out.println(t.channel);
		t.channelDown();
		System.out.println(t.channel);
		
		
		
		
	}	
}


class Tv {
	
	// �Ӽ�(����) ���� �����ϱ�
	String color;
	int channel;
	boolean power;
	
	void power() {
		power = !power;			// ���� on/off
	}

	void channelUp() {
		++channel;				// channel �ø���
	}
	
	void channelDown() {
		--channel;				// channel ������
	}
}
