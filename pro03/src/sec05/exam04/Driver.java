package sec05.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //강제타입변환은 instanceof를 사용해야 정석
			Bus bus=(Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}
