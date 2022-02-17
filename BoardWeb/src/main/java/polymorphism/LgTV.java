package polymorphism;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
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
		System.out.println("Lg tv �Ҹ� �ø���.");		
	}

	@Override
	public void volumDown() {
		System.out.println("Lg tv �Ҹ� ������.");
		
	}
}



