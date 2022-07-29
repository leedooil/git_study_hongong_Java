package sec01.exam25;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 초기값일 경우]");
		Integer obj1=300;
		Integer obj2=300;
		System.out.println("==결과: "+(obj1==obj2));
		System.out.println("언박싱후==결과: "+(obj1.intValue()==obj2.intValue()));
		System.out.println("equals()==결과: "+(obj1.equals(obj2)));
		System.out.println();
		
		System.out.println("[-128~127 초기값일 경우]");
		Integer obj3=10;
		Integer obj4=10;//obj3과obj4의 힙영역 객체주소값이 다르더라도 byte형이기때문에 -128~127 범위의 
		System.out.println("==결과: "+(obj3==obj4));//숫자는 알아서 동등비교연산해줌
		System.out.println("언박싱후==결과: "+(obj3.intValue()==obj4.intValue()));
		System.out.println("equals()==결과: "+(obj3.equals(obj4)));
	}

}
