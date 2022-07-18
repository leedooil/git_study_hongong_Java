package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone=new Phone(); 추상클래스는 혼자 new연산자로 객체생성불가
		
		SmartPhone smartPhone=new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
