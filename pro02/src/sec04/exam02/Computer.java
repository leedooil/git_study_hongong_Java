package sec04.exam02;

public class Computer {
				//매개변수를 배열타입으로 선언
		int sum1(int[] values) {
			int sum=0;
			for(int i=0;i<values.length;i++) {
				sum+=values[i];
			}
			
		return sum;
	}
		int sum2(int ... values) {
			int sum=0;
			for(int i=0;i<values.length;i++) {
				sum+=values[i];
			}
			return sum;
		}

}
