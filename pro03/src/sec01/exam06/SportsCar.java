package sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed+=10;
		System.out.println("속도를 "+speed+" 증가시킵니다.");
	}
//	@Override 오버라이딩 할 수 없음
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//      speed=0;  
//	}
	
	public static void main(String[] args) {
	SportsCar car=new SportsCar();
	car.speedUp();
	car.speedUp();
	car.speedUp();
	car.speedUp();
	car.speedUp();
	car.speedUp();
	car.speedUp();
	car.speedUp();
	car.speedUp();
	car.speedUp();
	car.stop();
}
}
