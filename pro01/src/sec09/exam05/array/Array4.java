package sec09.exam05.array;

public class Array4 {

	public static void main(String[] args) {
		
		int[][]Array= {{10,15,7,3},{1,6,17,2},{20,2,6,4}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(Array[i][j]+"	");
				
			}
			System.out.println();
		}
		System.out.println();
		
		int data[][]=new int[3][4];
		data[0]=new int[4];
		data[1]=new int[4];
		data[2]=new int[4];
		
		data[0][0]=10;
		data[0][1]=15;
		data[0][2]=7;
		data[0][3]=3;
		
		data[1][0]=1;
		data[1][1]=6;
		data[1][2]=17;
		data[1][3]=2;
		
		data[2][0]=20;
		data[2][1]=2;
		data[2][2]=6;
		data[2][3]=4;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(data[i][j]+"	");
				
			}
			System.out.println();
		}
		
		
	}

}
