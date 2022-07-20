package sec04.exam04;

public class Television implements RemoteControl {
	//필드	
	private int volume;

	@Override //turnOn() 추상메소드의 오버라이딩
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override //turnOff() 추상메소드의 오버라이딩
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override //setVolume() 추상메소드의 오버라이딩
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOlUME) {
			this.volume=RemoteControl.MAX_VOlUME;
		}else if(volume<RemoteControl.MIN_VOlUME) {
			this.volume=RemoteControl.MIN_VOlUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}
	

}
