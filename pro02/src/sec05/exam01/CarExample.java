package sec05.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar=new Car("그랜저");
		Car yourCar=new Car("아반떼");
		
		myCar.run();
		System.out.println();
		yourCar.run();
	}

}
