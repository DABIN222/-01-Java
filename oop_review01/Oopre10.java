package com.our.oop_review01;


//	p.315 ���� 7-1 / ���



class Tv10 {
	//	�Ӽ�(����) ����
	boolean power;
	int channel;
	
	//	���(�޼ҵ�) ����
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv10{
	//	�Ӽ�(����) ����
	boolean caption;							// ĸ�� ����(onoff)
	
	//	���(�޼���) ����
	void displayCaption(String text) {
		if(caption) {							// ���� caption���¸�
			System.out.println(text);			// text ���
			
		}
	}
}


public class Oopre10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaptionTv ctv =new CaptionTv();
		ctv.channel = 10;
		System.out.println(ctv.channel);
		ctv.channelUp();
		System.out.println(ctv.channel);

		ctv.displayCaption("Hello, Wolrd");		// true���� ���������� �ʾ� �۵� X
		ctv.caption = true;
		ctv.displayCaption("Hello, Wolrd");		// true�̱⿡ text�� ���
		
		
	}
}
