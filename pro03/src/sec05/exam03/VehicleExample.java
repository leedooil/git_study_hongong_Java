package sec05.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus();
		
		vehicle.run();
//		vehicle.checkFare 호출불가 Vehicle형이기 때문에 Bus클래스에서 오버라이딩된 메소드만 사용가능
		
		Bus bus =(Bus) vehicle; //강제타입변환
		
		bus.run();
		bus.checkFare();
	}

}
