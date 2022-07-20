package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		A a=new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b=a.new B(); //인스턴스 멤버 클래스는 반드시 객체생성후 참조변수로 호출
		b.field1=3;
		System.out.println(b.field1);
		b.method1();
		
		//static(정적) 멤버 클래스 객체 생성
		A.C c=new A.C(); //정적 멤버 클래스 안에있는 인스턴스필드와 메소드를 호출하기위한 객체생성
		c.field1=4;		 //원래 정적 멤버 클래스는 객체생성없이 클래스명으로 호출함	
		System.out.println(c.field1);
		c.method1();
		A.C.field2=5;
		System.out.println(A.C.field2);
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}

}