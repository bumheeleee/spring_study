package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	//��ü�� �̸��� �̿��Ͽ� ������ ������ ó���Ѵ�.
	@Resource(name = "apple")
	private Speaker speaker;
	
	public LgTV(){
		System.out.println("Lg tv ��ü ����!!!!!");
	}

	@Override
	public void powerOn() {
		System.out.println("Lg tv ���� �Ҵ�.");
	}

	@Override
	public void powerOff() {
		System.out.println("Lg tv ���� ����.");
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



