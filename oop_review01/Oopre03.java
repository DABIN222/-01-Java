package com.our.oop_review01;

public class Oopre03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// �迭�� // 	class�̸� �����̸� = new class �̸�[����]
		Tv03 tvArr[] = new Tv03[3];
		
		for (int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv03();			//  ��ü �����ؼ� �迭�� �� ��ҿ� ���� �� �������
			tvArr[i].channel = i+10;
			System.out.printf("tvArr[%d].channel = %d%n",i,tvArr[i].channel);
		}
		
		
		
	}

}


class Tv03{
	// �Ӽ�(����) ����
	int channel;
	
	// ���(�޼ҵ�) ����
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
}