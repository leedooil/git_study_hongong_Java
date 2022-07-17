package sec03.exam03;

public class Car {
	//필드
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//기본생성자
	Car(){
	}
	
	//생성자 오버로딩
	Car(String model){
		this.model=model; //this.으로 필드변수 초기화
	}
	
	Car(String model, String color){
		this.model=model;
		this.color=color;
	}
	
	Car(String model, String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
		

}
