package sec05.verify.exam11;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String name = sc.nextLine();
		
		System.out.print("패스워드 : ");
		String strPassword = sc.nextLine();
		
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
					
			}else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		}else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		
		}
	}

}
