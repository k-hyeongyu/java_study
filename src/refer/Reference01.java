package refer;

import java.util.Scanner;

public class Reference01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str1 = "아침";
		String str2 = "아침";
		String str3 = scanner.nextLine();
		
		System.out.println(str1==str2); //참조변수에서 == 비교는 값이 아닌 주소만 비교
		System.out.println(str2==str3);  //==이 기호는 변수의 주소가 "같은지" 를 따지는것 
		System.out.println(str2.equals(str3));
		
		//string 값 비교시에는 equals 사용
		
		int sum = 0;
		int num;
		
		sum = sum + 10;
		
		System.out.println(sum);
		
		String s1; //데이터가 아예 없음
		String s2 = null; //참조하는것이 없다는 것 자체가 초기화 null이라는 하나의 값
		//null 또한 하나의 데이터
		String s3 = "글자";
		
		//System.out.println(s1);  //s1에 값이 초기화 되어있지 않음
		System.out.println(s2); //null
		System.out.println(s3);
		
		if(s2 != null)
			System.out.println(s2.equals("글자"));
		
		
		
		
		
		
		
		
		}

}
