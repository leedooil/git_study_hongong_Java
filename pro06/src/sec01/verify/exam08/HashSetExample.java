package sec01.verify.exam08;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student>set=new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		Iterator<Student>iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum+":"+student.name);
		}
		System.out.println("총 객체수:"+set.size());
	}

}
