package sec01.exam27;

public class MathRandomExample {

	public static void main(String[] args) {
		int num=(int)(Math.random()*6)+1;
		System.out.println("주사위 눈: "+num);
		
		int v9=Math.min(5, 9);
		double v10=Math.min(5.3, 2.5);
		System.out.println("v9= "+v9);
		System.out.println("v10= "+v10);
		
		double v11=Math.random();
		System.out.println("v11= "+v11);
		
		double v12=Math.rint(5.3);
		double v13=Math.rint(5.7);
		System.out.println("v12= "+v12);
		System.out.println("v13= "+v13);
		
		long v14=Math.round(5.3);
		long v15=Math.round(5.7);
		System.out.println("v14= "+v14);
		System.out.println("v15= "+v15);
		
		double value=12.3456;
		double temp1=value*100;
		long temp2=Math.round(temp1);
		double v16=temp2/100.0;
		System.out.println("v16= "+v16);
		
		
	}

}
