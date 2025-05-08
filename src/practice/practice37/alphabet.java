package practice.practice37;

import java.util.*;

public class alphabet {

	public static void main(String[] args) {

		String str = "Returns a completion of the value and message";
		
		str = str.replace(" ", "").toLowerCase(); //모든 문자 소문자로 변경과 재배치
		
		int count = str.length(); //소문자 변경 후 공백없이 재배치된 문자의 갯수 str -> notSpace -> count
		
		System.out.println(count + "개");
		
		
		System.out.println();
		System.out.println("===================================");
		System.out.println();
		
		//String str = "Returns a completion of the value and message";
		
		Map<Character, Integer> map = new HashMap<>(); //문자열
		
		for (char c : str.toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "의 개수: " + entry.getValue());
		}
	}
}
