package polymorphism;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int price;
	
	public void ininMethod(){
		System.out.println("��ü ���� �� ������� �ʱ�ȭ �۾�....");
	}
	
	public void destoryMethod(){
		System.out.println("��ü ���� ���� ó���� ���� ó��....");
	}
	
	public SamsungTV(){
		System.out.println("�Ｚtv ��ü ����!!");
	}
	
	public SamsungTV(Speaker speaker){
		System.out.println("SamsungTV(2)��ü����");
		this.speaker = speaker;
	}
	
	//1. ������ ������ �̿�
	//2. �ټ� ���� ����
	//3. ���� ���踦 ������ �������ϸ� �̿��ؼ� ������ �� �ְ� ����
	public SamsungTV(Speaker speaker, int price){
		System.out.println("SamsungTV(3)��ü����");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn(){
		System.out.println("�Ｚ tv ���� �Ҵ�. ������ : "+ price);
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
