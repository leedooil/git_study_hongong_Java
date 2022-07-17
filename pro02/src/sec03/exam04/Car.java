package sec03.exam04;

public class Car {
	//필드
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//기본생성자
	Car(){
	}
	
	Car(String model){
		this(model,null,0); //생성자에서 다른 생성자 호출. 하나씩 this.으로 초기화 안해줘도됨
	}
	
	Car(String model, String color){
		this(model,color,0);
	}
	
	Car(String model, String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}


}
