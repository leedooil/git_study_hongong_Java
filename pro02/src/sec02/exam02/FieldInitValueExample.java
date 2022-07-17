package sec02.exam02;

public class FieldInitValueExample {

	public static void main(String[] args) {
		//객체 생성
		FieldInitValue fiv=new FieldInitValue();
		//필드 값 읽기
		System.out.println("byteField: "+fiv.byteField);
		System.out.println("shortField: "+fiv.shortField);
		System.out.println("intField: "+fiv.intField);
		System.out.println("longField: "+fiv.longField); //0L출력
		System.out.println("booleanField: "+fiv.booleanField);
		System.out.println("charField: "+fiv.charField); //유니코드0이 출력
		System.out.println("floatField: "+fiv.floatField); //0.0F출력
		System.out.println("doubleField: "+fiv.doubleField);
		System.out.println("arrField: "+fiv.arrField);
		System.out.println("referenceField: "+fiv.referenceField);
	}

}
