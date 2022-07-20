package sec04.exam05;

public class SmartTelevision implements RemoteControl,Searchable {
	private int volume;
		
	@Override
	public void search(String url) {
		System.out.println(url+"을/를 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
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
