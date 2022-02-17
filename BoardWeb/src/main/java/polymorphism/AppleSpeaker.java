package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("애플 스피커 객체 생성!!!");
	}

	public void volumUp() {
		System.out.println("애플 스피커 소리를 올린다!!!");
		
	}
	
	public void volumDown() {
		System.out.println("애플 스피커 소리를 내린다!!!");
		
	}

}
