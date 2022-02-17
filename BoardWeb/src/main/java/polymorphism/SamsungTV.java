package polymorphism;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV(){
		System.out.println("�Ｚtv ��ü ����(1) !!");
	}
	
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() �żҵ� ȣ�� !!");
		this.speaker = speaker;
	}


	public void setPrice(int price) {
		System.out.println("setPrice() �żҵ� ȣ�� !!");
		this.price = price;
	}

	
	public void powerOn(){
		System.out.println("�Ｚ tv ���� �Ҵ�. ������ : "+ price);
	}
	
	
	public void powerOff(){
		System.out.println("�Ｚ tv ���� ����.");
	}
	
	
	public void volumUp(){
		speaker.volumUp();
	}
	
	
	public void volumDown(){
		speaker.volumDown();
	}
	
	
}
