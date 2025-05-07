package collect;

import java.util.*;

public class Collection02 {

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		System.out.println(set1.size());
		
		System.out.println(set1.contains("C"));
		
		for(String value : set1) {
			System.out.println(value);
		}
		
		Iterator<String> it1 = set1.iterator();
		
		//iterator
		//hashNext()
		//next()
		
		while(it1.hasNext()) { // A  B  C
			String s = it1.next();
			System.out.println(s + " ");
		}
		System.out.println();
	}

}
