package collect;

import java.util.*;
import java.util.Map.Entry;

public class Collection03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap
		
		// key    value 
		//출석번호    이름
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "일");
		map1.put(2, "이");
		map1.put(3, "삼");
		map1.put(3, "사");
		
		System.out.println(map1.size());
		System.out.println(map1.containsKey(3));
		System.out.println(map1.containsKey(5));
		
		System.out.println("=================================");
		
		System.out.println(map1.containsValue("일"));
		System.out.println(map1.containsValue("삼"));
		
		System.out.println("=================================");
		
		System.out.println(map1.get(1)); //키 값을 읽어옴
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("규칙1", "지각하지 않기");
		map2.put("규칙2", "결석하지 않기");
		
		System.out.println(map2.get("규칙2")); //키 값을 읽어옴
		
		//map1.keySet()
		System.out.println("==============map1 key=========");
		for(int key : map1.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();
		
		System.out.println("==============map1 value=========");
		
		for(String value : map1.values()) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		Set<Entry<Integer, String>> entrySet = map1.entrySet();
		
		System.out.println("=============map1 entrySet=================");
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
