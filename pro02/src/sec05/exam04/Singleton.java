package sec05.exam04;

public class Singleton {

	public static Singleton singleton=new Singleton();
	
	private Singleton() {}
	
	static Singleton getInsrance() {
		return singleton;
	}

}
