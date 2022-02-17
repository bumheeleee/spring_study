package polymorphism;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV(){
		System.out.println("삼성tv 객체 생성(1) !!");
	}
	
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() 매소드 호출 !!");
		this.speaker = speaker;
	}


	public void setPrice(int price) {
		System.out.println("setPrice() 매소드 호출 !!");
		this.price = price;
	}

	
	public void powerOn(){
		System.out.println("삼성 tv 전원 켠다. 가격은 : "+ price);
	}
	
	
	public void powerOff(){
		System.out.println("삼성 tv 전원 끈다.");
	}
	
	
	public void volumUp(){
		speaker.volumUp();
	}
	
	
	public void volumDown(){
		speaker.volumDown();
	}
	
	
}
