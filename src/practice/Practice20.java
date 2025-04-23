package practice;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
	
		//prac01();
		//prac02();
		//prac03();
		prac04();
	}
	public static void prac01() {
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(2*x + 4*y == 10) {
					System.out.printf("x: %d y:%d \n", x ,y);
				}
			}
		}
	}
	public static void prac02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두개의 정수 입력");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		}else {
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		}
		
		
	}
//	public static void prac03() {
//		Scanner scanner = new Scanner(System.in);
//		
//		int[] yutArr = new int[4];
//		
//		System.out.println("윷 값 입력(1: 뒤집어짐, 0: 안뒤집어짐) :");
//		for(int i =0; i<yutArr.length; i++) {
//			yutArr[i] = scanner.nextInt();
//		}
//		int sum =0;
//		for(int i=0; i<yutArr; i++) {
//			sum = sum + yutArr[i];
//		
//		}
//		
//	}
	public static void prac04() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scanner.nextInt();
		
//		for(int i =0; i<=num; i++) {
//			System.out.print("*");
//		}
		
		int i =1;
		while(i<=num) {
			System.out.print("*");
			i++;
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
