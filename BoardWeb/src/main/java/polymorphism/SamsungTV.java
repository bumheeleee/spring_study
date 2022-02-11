package polymorphism;

public class SamsungTV implements TV {
	
	public void powerOn(){
		System.out.println("»ï¼º tv Àü¿ø ÄÒ´Ù.");
	}
	
	public void powerOff(){
		System.out.println("»ï¼º tv Àü¿ø ²ö´Ù.");
	}
	
	public void volumUp(){
		System.out.println("»ï¼º tv ¼Ò¸® ¿Ã¸°´Ù.");
	}
	
	public void volumDown(){
		System.out.println("»ï¼º tv ¼Ò¸® ³»¸°´Ù.");
	}
}
