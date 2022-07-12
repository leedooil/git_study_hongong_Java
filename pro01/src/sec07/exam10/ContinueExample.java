package sec07.exam10;

public class ContinueExample {

	public static void main(String[] args) throws Exception {
		System.out.println("*** 짝수 ***");
		for(int i=1;i<=10;i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i);
		}
		System.out.println();
		System.out.println("*** 홀수 ***");
		for(int j=1;j<=10;j++) {
			if(j%2 == 0) {
				continue;
			}
			System.out.print(j);
		}
	}
	

}
