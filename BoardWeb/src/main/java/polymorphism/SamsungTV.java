package polymorphism;

public class SamsungTV implements TV {
	
	public SamsungTV(){
		System.out.println("�Ｚtv ��ü ����.");
	}
	
	public void powerOn(){
		System.out.println("�Ｚ tv ���� �Ҵ�.");
	}
	
	public void powerOff(){
		System.out.println("�Ｚ tv ���� ����.");
	}
	
	public void volumUp(){
		System.out.println("�Ｚ tv �Ҹ� �ø���.");
	}
	
	public void volumDown(){
		System.out.println("�Ｚ tv �Ҹ� ������.");
	}
}
