package sec01.verify.exam07;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str="모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index=9;
		if(index==-1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		}else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str="모든 프로그램은 Java 언어로 개발 될 수 있다.";
			System.out.println("--->"+str);
		}
	}

}
