package polymorphism;

public class SonySpeaker implements Speaker{

	public SonySpeaker(){
		System.out.println("�Ҵ� ����Ŀ ��ü ����!!!");
	}
	
	public void volumUp(){
		System.out.println("�Ҵ� ����Ŀ �Ҹ��� �ø���!!!");
	}
	
	public void volumDown(){
		System.out.println("�Ҵ� ����Ŀ �Ҹ��� ������!!!");
	}
	
}
