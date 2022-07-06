package sec05.verify.exam09;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		double num1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("두 번째 수 : ");
		double num2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("-------------------------");
		if(num2!=0.0) {
			System.out.println("결과 : "+(num1/num2)); // double일때 / 연산은 분수꼴연산됨
		}else {										  // int 일때 / 연산은 몫을 구해준다	
			System.out.println("결과 : 무한대");
		}
	}

}
