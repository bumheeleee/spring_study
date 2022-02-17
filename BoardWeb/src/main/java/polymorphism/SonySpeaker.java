package polymorphism;

public class SonySpeaker implements Speaker{

	public SonySpeaker(){
		System.out.println("소니 스피커 객체 생성!!!");
	}
	
	public void volumUp(){
		System.out.println("소니 스피커 소리를 올린다!!!");
	}
	
	public void volumDown(){
		System.out.println("소니 스피커 소리를 내린다!!!");
	}
	
}
