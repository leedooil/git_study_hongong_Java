package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {
		Parent parentA=new Child();
		method1(parentA);
		method2(parentA);

		Parent parentB=new Parent();
		method1(parentB);
		method2(parentB); //오류발생
	}
	public static void method1(Parent parent) {
		if(parent instanceof Child) { //parent가 child객체야? true
			Child child=(Child)parent;//강제 타입변환시에는 instanceof를 사용하자
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	public static void method2(Parent parent) {
		Child child =(Child)parent; //좋은 방법아님 오류날수있음
		System.out.println("method2 - Child로 변환 성공");
	}

}
