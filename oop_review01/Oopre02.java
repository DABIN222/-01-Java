package com.our.oop_review01;



public class Oopre02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tv01 t1 = new Tv01();
		Tv01 t2 = new Tv01();
		
		
		
		
		t1.channel = 0;
		t2.channel = 0;
		System.out.printf("t1�� channel�� %d �Դϴ�.%n",t1.channel);
		System.out.printf("t2�� channel�� %d �Դϴ�.%n",t2.channel);
		
		t1.channel  = 7;
		System.out.printf("t1�� channel�� %d �� �����Ͽ����ϴ�.%n",t1.channel);
		System.out.printf("t1�� channel�� %d �Դϴ�.%n",t1.channel);

		t1.channel  = 0;
		System.out.printf("t2�� channel�� %d �Դϴ�.%n",t2.channel);

		
	}

}


class Tv01 {
	// �Ӽ�(����) ���� ����
	int channel;
	
	
	// �޼���(���) ����
	void ChannelUp() {
		++channel;
	}
	
	void ChannelDown() {
		--channel;
	}
	
	
	
}
