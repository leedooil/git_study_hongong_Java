package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		
		//Singleton obj1=new Singleton(); 컴파일 에러남 private접근유형은 외부클래스에서 안보임
		
		Singleton obj1=Singleton.getInsrance();
		Singleton obj2=Singleton.getInsrance();
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}
