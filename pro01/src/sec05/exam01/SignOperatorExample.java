package sec05.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		//byte result3 = -b; 이러면 에러남 바이트를 인트로 바꿔줘야함 -1곱하기b
		int result3 = -b;
		System.out.println("result3 = " + result3);

	}

}
