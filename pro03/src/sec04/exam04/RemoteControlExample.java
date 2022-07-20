package sec04.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc=null;
		rc=new Television();
		rc.turnOn();
		rc.setVolume(30);
		rc.turnOff();
				
		rc=new Audio();
		rc.turnOn();
		rc.setVolume(9);
		rc.turnOff();
		
		
	}

}
