package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 10000000000;    뒤에 접미사L없어서 기본형 int사용 돼서 메모리용량 부족으로 에러
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);

	}

}
