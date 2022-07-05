package sec05.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2=1;
		double v3=1.0;
		System.out.println(v2==v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5); //자동형변환 double되서 v4는 15자리 v5는 6자리여서 false남
		System.out.println((float)v4==v5);
		System.out.println((int)v4==(int)v5);

	}

}
