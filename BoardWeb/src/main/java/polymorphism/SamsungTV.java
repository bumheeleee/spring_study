package polymorphism;

public class SamsungTV implements TV {
	
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
