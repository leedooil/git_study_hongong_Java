package sec04.exam06;

public interface RemoteControl {
		//상수
		int MAX_VOlUME=10;
		int MIN_VOlUME=0;
		
		//추상 메소드
		void turnOn();
		void turnOff();
		void setVolume(int volume);
	
}
