package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	//객체의 이름을 이용하여 의존성 주입을 처리한다.
	@Resource(name = "apple")
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



