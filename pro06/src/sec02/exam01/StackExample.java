package sec02.exam01;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin>coinBox=new Stack<Coin>();
		
		coinBox.add(new Coin(100));
		coinBox.add(new Coin(50));
		coinBox.add(new Coin(500));
		coinBox.add(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin=coinBox.pop();
			System.out.println("꺼내온 동전 : "+coin.getValue()+"원");
		}
	}

}
