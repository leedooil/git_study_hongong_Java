package sec02.exam04;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명 객체 로컬 변수 사용,메소드를 통해 로컬 변수값으로 대입후 로컬 변수 메소드 사용
		anony.method(0, 0);
	}

}
