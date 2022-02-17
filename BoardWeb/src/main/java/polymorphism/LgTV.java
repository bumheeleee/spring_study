package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	//1. �ַ� �������� �����Ͽ� �ش� Ÿ���� ��ü�� ã�Ƽ� �ڵ����� �Ҵ��Ѵ�.
	//2. ������ ���Կ� ����ߴ� Setter�żҵ峪 �����ڰ� �ʿ䰡 ����.
	@Autowired
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



