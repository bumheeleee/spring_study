package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("���� ����Ŀ ��ü ����!!!");
	}

	public void volumUp() {
		System.out.println("���� ����Ŀ �Ҹ��� �ø���!!!");
		
	}
	
	public void volumDown() {
		System.out.println("���� ����Ŀ �Ҹ��� ������!!!");
		
	}

}
