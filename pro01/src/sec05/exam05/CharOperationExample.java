package sec05.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1 ;
		char c2 = 'A';
		//char c3 = c2 + 1; c2는 이미 변수라서 변수 + 숫자는 String 써야함
		//c1에서는 'A'와 1 모두 리터럴상수이기 때문에 char로 연산가능 
		System.out.println("c1 : "+c1);
		System.out.println("c2 : "+c2);

	}

}
