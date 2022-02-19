package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	//1. 주로 변수위에 설정하여 해당 타입의 객체를 찾아서 자동으로 할당한다.
	//2. 의존성 주입에 사용했던 Setter매소드나 생성자가 필요가 없다.
	@Autowired
	private Speaker speaker;
	
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
		speaker.volumUp();
	}

	@Override
	public void volumDown() {
		speaker.volumDown();
	}
}



