package sec03.exam02;

public class Cat extends Animal {
	//생성자를 통한 초기화
	public Cat() {
		this.kind="포유류";
	}
	@Override //추상클래스메소드에 처리부를 넣어 재정의 오버라이딩
	public void sound() {
		System.out.println("야옹");
	}

}
