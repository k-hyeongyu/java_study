package collect;

import java.util.*;

public class Collection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList
		
		String[] arr = new String[3];
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(String value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		ArrayList<String> list2 = null;
		//ArrayList<MENU>
		
		System.out.println(list.size(/*사이즈라는 메소드를 부름*/));
		//System.out.println(list2.size(/*사이즈라는 메소드를 부름*/));
		
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		
		System.out.println(list.size());
		System.out.println(list.get(1));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.add(2, "A"); //2인덱스에 "A"를 추가 (2인덱스의 뒤는 뒤로 한칸 밀리게됨)
		list.set(3, "H"); //3인덱스에 "H" 저장 (해당위치 값이 바뀜)
		list.remove(0);
		list.remove("G");
		
		for(String v : list) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		System.out.println(list.contains("Z"));
		System.out.println(list.contains("E"));
		
		int[] intArr = new int[10];
		
		//ArrayList<int> list = new ArrayList<int>();
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		//Integer.parseInt(null)
		
		//int -> Integer
		//double -> Double
		//boolean -> Boolean
		
		intlist.add(10);
		intlist.add(50);
		
		System.out.println(intlist.isEmpty());
		System.out.println(intlist.size());
		
		for(int n : intlist) {
			System.out.println(n + " ");
		}
		System.out.println();
	}

}
