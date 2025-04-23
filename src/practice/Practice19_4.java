package practice;

import java.util.Scanner;

public class Practice19_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int x = scan.nextInt();
		
		for(int i =0; i<x; i++) {
			System.out.print("*");
		}

	}
}
