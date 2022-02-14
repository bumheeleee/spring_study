package polymorphism;

public class SamsungTV implements TV {
	
	private SonySpeaker speaker;
	
	public void ininMethod(){
		System.out.println("객체 생성 후 멤버변수 초기화 작업....");
	}
	
	public void destoryMethod(){
		System.out.println("객체 삭제 전에 처리할 로직 처리....");
	}
	
	public SamsungTV(){
		System.out.println("삼성tv 객체 생성!!");
	}
	
	//생성자 인젝션 이용
	public SamsungTV(SonySpeaker sonyspeaker){
		System.out.println("SamsungTV(2)객체생성");
		this.speaker = sonyspeaker;
	}
	
	public void powerOn(){
		System.out.println("삼성 tv 전원 켠다.");
	}
	
	public void powerOff(){
		System.out.println("삼성 tv 전원 끈다.");
	}
	
	//삼성이 소니 스피커를 사용할때
	public void volumUp(){
		speaker.volumUp();
		//System.out.println("삼성 tv 소리 올린다.");
	}
	
	//삼성이 소니 스피커를 사용할때
	public void volumDown(){
		speaker.volumDown();
		
		//System.out.println("삼성 tv 소리 내린다.");
	}
}
