package sec01.exam24;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		
		//문자를 숫자형이나 논리형으로 바꿀때 ex)Integer.parseInt(); 클래스명으로 호출하기 때문에 정적메소드
		int value1=Integer.parseInt("10");
		double value2=Double.parseDouble("3.14");
		boolean value3=Boolean.parseBoolean("true");
		
		System.out.println("value1: "+value1);
		System.out.println("value2: "+value2);
		System.out.println("value3: "+value3);
				
	}

}
