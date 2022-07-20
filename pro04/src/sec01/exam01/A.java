package sec01.exam01;

//상위 바깥 클래스
class A {
	A(){System.out.println("A 객체가 생성됨");}
	
	//하위 인스턴스 멤버 클래스
	class B {
		B(){System.out.println("B 객체가 생성됨");}
		int field1;
		//static int field2; B클래스가 인스턴스 클래스여서 static필드,메소드 호출 불가
		void method1() {
			System.out.println("method1() 호출");
		}
		//static void method2(){}
	}
	
	//하위 정적 멤버 클래스
	static class C {
		C(){System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {
			System.out.println("method1() 호출");
		}
		static void method2() {
			System.out.println("method2() 호출");
		}
	}
	void method() {
		//상위클래스 메소드안에 있는 로컬 클래스
		class D{
			D(){System.out.println("D 객체가 생성됨");}
			int field1;
			//static int field2;
			void method1() {
				System.out.println("method1() 호출");
			}
			//static void method2(){}
		}
		D d=new D();
		d.field1=6;
		System.out.println(d.field1);
		d.method1();
	}
}
