package practice;

import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {

		//	    prac01();
		//		prac02();
		//		prac03();
		//		prac04();
			    prac05();
		//prac06();
	}
	public static void prac01() {
		/*
		 	for(초기화; 조건; 증감)
		 		i=1; i<=10; i++
		 		i=num; i<=10; i++
		 		i=1; i<=10; i=i+num
		 */
		for(int i = 1; i <= 5; i++) {// i: 1 2 3 4 5
			for(int j =i; j<=i;j++) {
				System.out.println("*");
			}
		}	
	}
	public static void prac02() {

	}
	public static void prac03() {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 : ");
		int num = scan.nextInt();

		for(int i=1; i<=num; i++) {
			if(num%i ==0)
				System.out.println(i+ " ");
		}


	}
	/*public static void prac04() {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 : ");
		int num = scan.nextInt();

		for(int i = 0; i<num; i++) {
			for(int j= 0; j <= i; j++) {
				System.out.print("*");
			}
			for(int i=num-1; i<num; i++) {
				for(int j= 0; j <= i; j++) {
					System.out.println("*");	
				}
				System.out.println();	
			}
		}

	}*/
	public static void prac05() {
		
		int sum =0;
		 
		for(int i =1; i<=10; i++) {
			for(int j =1; j<=i; j++) {
				sum += j;
			}
		}
		System.out.println("총합 : " + sum);
	}

	public static void prac06() {
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(i%2==0) { //짝수
				sum = sum - i;
			}else {		 //홀수
				sum = sum + i;
			}
						
			if(sum >= 100)
				break;
			i++;
		}
		System.out.println("100이 넘는 시점의 누적합 : " +sum);
		System.out.println("마지막에 연산된 값 : " + i);
		
	}
}
