package polymorphism;

public class SamsungTV implements TV {
	
	private SonySpeaker speaker;
	
	public void ininMethod(){
		System.out.println("��ü ���� �� ������� �ʱ�ȭ �۾�....");
	}
	
	public void destoryMethod(){
		System.out.println("��ü ���� ���� ó���� ���� ó��....");
	}
	
	public SamsungTV(){
		System.out.println("�Ｚtv ��ü ����!!");
	}
	
	//������ ������ �̿�
	public SamsungTV(SonySpeaker sonyspeaker){
		System.out.println("SamsungTV(2)��ü����");
		this.speaker = sonyspeaker;
	}
	
	public void powerOn(){
		System.out.println("�Ｚ tv ���� �Ҵ�.");
	}
	
	public void powerOff(){
		System.out.println("�Ｚ tv ���� ����.");
	}
	
	//�Ｚ�� �Ҵ� ����Ŀ�� ����Ҷ�
	public void volumUp(){
		speaker.volumUp();
		//System.out.println("�Ｚ tv �Ҹ� �ø���.");
	}
	
	//�Ｚ�� �Ҵ� ����Ŀ�� ����Ҷ�
	public void volumDown(){
		speaker.volumDown();
		
		//System.out.println("�Ｚ tv �Ҹ� ������.");
	}
}
