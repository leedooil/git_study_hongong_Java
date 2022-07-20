package sec01.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B { //하위 인스턴스 클래스는 상위 클래스의 인스턴스든 정적이든 필드, 메소드 전부 받을 수 있음
		void method() {
			field1=10;
			method1();
			
			field2=20;
			method2();
		}
	}
	
	static class C { //하위 정적 클래스는 상위 클래스의 정적 필드,메소드만 받을 수 있음
		void method() {
//			field1=10;
//			method1();
			
			field2=10;
			method2();
		}
	}
	


}
