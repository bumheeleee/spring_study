package polymorphism;

public class LgTV implements TV{

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



