package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1+byteValue2; 이러면 에러남 바이트보다 상위 int로 바꿔
		int intValue1 = byteValue1+byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1+charValue2; 이러면 에러남 +가 들어갔으니까 int로 바꾸고 출력
		int intValue2 = charValue1+charValue2;
		System.out.println("유니코드="+intValue2);
		System.out.println("출력문자="+(char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; 에러남 정수에서 실수로 바꾸자
		double doubleValue = intValue5/4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x/y;
		System.out.println(result);
				

	}

}
