package sec01.verify.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name=null;
		int maxScore=0;
		int totalScore=0;
				
//		name="blue";
//		maxScore=map.get("blue");
//		totalScore=map.get("blue")+map.get("hong")+map.get("white");
//				
//		System.out.println("평균점수:"+(totalScore/map.size()));
//		System.out.println("최고점수:"+maxScore);
//		System.out.println("최고점수를 받은 아이디:"+name);
		
		Set<Map.Entry<String, Integer>> mapEntry = map.entrySet();
		for(Map.Entry<String, Integer> entry : mapEntry) {
			if(entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		int avgValue = totalScore/map.size();
		
		System.out.println("평균점수:"+ avgValue);
		System.out.println("최고점수:"+maxScore);
		System.out.println("최고점수를 받은 아이디:"+name);
	}

}
