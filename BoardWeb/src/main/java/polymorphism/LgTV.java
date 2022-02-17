package polymorphism;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	public LgTV(){
		System.out.println("Lg tv 객체 생성!!!!!");
	}

	@Override
	public void powerOn() {
		System.out.println("Lg tv 전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("Lg tv 전원 끈다.");
	}

	@Override
	public void volumUp() {
		System.out.println("Lg tv 소리 올린다.");		
	}

	@Override
	public void volumDown() {
		System.out.println("Lg tv 소리 내린다.");
		
	}
}



