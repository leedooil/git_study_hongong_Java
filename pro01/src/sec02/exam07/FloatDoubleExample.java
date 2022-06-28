package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
//		float var1 = 3.14; 3.14뒤에 f안붙여줘서 에러남
		float var2 = 3.14f;
		double var3 = 3.14;
		//정밀도(소수점 자리수)테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		//자연대수 e사용
		double var6 = 3e6;  //3*10의6승
		float var7 = 3e6F;
		double var8 = 2e-3;  //2*10의-3승
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		
		

	}

}
