package generic;

public class Code231 {

	public static void main(String[] args) {
		Data2<Integer>d=new Data2<Integer>(100);
		int result=d.calcMultiple(5);
		System.out.println(result);

		Data2<Double>e=new Data2<Double>(17.5);
		int result2=e.calcMultiple(5);
		System.out.println(result2);
	}

}

class Data2<T extends Number>{
	T obj;
	Data2(T ob){
		obj=ob;
	}
	int calcMultiple(int n) {
		return obj.intValue()*n;
	}
}