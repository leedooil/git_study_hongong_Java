package sec01.exam05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member>set=new HashSet<Member>();
		
		set.add((new Member("홍길동",30)));
		set.add((new Member("홍길동",30)));
		
		Iterator<Member>iterator = set.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member.age+":"+member.name);
		}
		
		System.out.println("총 객체수:"+set.size());
	}

}
