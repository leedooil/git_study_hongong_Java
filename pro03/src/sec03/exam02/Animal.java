package sec03.exam02;

public abstract class Animal {
	//필드
	public String kind;
	
	//생성자
	
	//메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound(); //선언부만 있고 처리부는 없는 메소드

}
