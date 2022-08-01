package sec01.exam26;

public class MathExample {

	public static void main(String[] args) {
		int v1=Math.abs(-5);
		double v2=Math.abs(-3.14);
		System.out.println("v1= "+v1);
		System.out.println("v2= "+v2);
		
		double v3=Math.ceil(5.3);  //ceil(올림)과 floor(내림)은 자주 사용하니 숙지
		double v4=Math.ceil(-5.3);
		System.out.println("v3= "+v3);
		System.out.println("v4= "+v4);
		
		double v5=Math.floor(5.3); //ceil(올림)과 floor(내림)은 자주 사용하니 숙지
		double v6=Math.floor(-5.3);
		System.out.println("v5= "+v5);
		System.out.println("v6= "+v6);
		
		int v7=Math.max(5, 9);
		double v8=Math.max(5.3, 2.5);
		System.out.println("v7= "+v7);
		System.out.println("v8= "+v8);
		
	}

}
