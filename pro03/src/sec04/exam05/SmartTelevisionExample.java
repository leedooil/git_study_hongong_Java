package sec04.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv=new SmartTelevision();
		
		RemoteControl rc=tv;
		rc.turnOn();
		rc.setVolume(60);
		rc.turnOff();
		
		Searchable sc=tv;
		sc.search("뉴스");
		
	}

}
