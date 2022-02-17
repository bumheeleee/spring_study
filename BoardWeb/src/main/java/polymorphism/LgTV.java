package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	//1. 주로 변수위에 설정하여 해당 타입의 객체를 찾아서 자동으로 할당한다.
	//2. 의존성 주입에 사용했던 Setter매소드나 생성자가 필요가 없다.
	@Autowired
	//3. 의존성 주입 대상이 되는 speaker 객체가 두개 이상일때 발생할 수 있는 문제를 객체를 지정함으로써 해결한다.
	@Qualifier("sony")
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



