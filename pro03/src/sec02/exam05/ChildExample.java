package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent=new Child();
		parent.field1="data1";
		parent.method1();
		parent.method2();

//		parent.field2="data2"; child객체를 생성했지만 매개변수타입이 parent타입이라서 child클래스 사용불가
//		parent.method3();
		
		Child child=(Child)parent; //parent타입을 child타입으로 강제 형변환
		child.field2="yyy";		   //상속받은 child객체는 parent클래스까지 사용가능	
		child.method3();		   //이런 강제형변환은 좋은 방법은 아님
		
	}

}
