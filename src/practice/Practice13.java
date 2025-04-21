package practice;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {

		//	prac01();
		//	prac02();
		//	prac03();
		//	prac04();
		//	prac05();
		//	prac06();
		//	prac07();
	}
	public static void prac01() {

		Scanner scan =new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();

		if(num % 2 ==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		/*System.out.println((num%2==0) ? "even" : "odd");
		삼항연산자*/
		scan.close();
	}


	public static void prac02() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int num = scanner.nextInt();

		if (num % 7 == 0) {
			System.out.println("7의 배수입니다.");  // 7의 배수일 경우
		} else {
			System.out.println("아닙니다.");        // 7의 배수가 아닐 경우
		}
		scanner.close();
	}


	public static void prac03() {
		int num = 0 ;

		for(int i =0; i<=1000; i++) { //1부터 1000까지의 반복
			if(i %5==0) { //그 안에서 5의 배수만 선택
				num += i; //5의 배수 합을 num에 저장
			}
		}
		System.out.println(num);

		num =0 ;
		for(int i=5; i<=1000; i += 5) {
			num+=i;
		}
	}


	public static void prac04() {
		Scanner scan = new Scanner(System.in);

		System.out.print("50까지의 수를 입력하세요 : ");
		int num = scan.nextInt();

		if(50 >= num && num >=1 ) {
			for(int i=1; i<=num; i++) {
				System.out.print("*");
			}

		}else {
			System.out.println("1부터 50까지의 숫자만");
		}
		scan.close();
	}


	public static void prac05() {
		int num =0;

		for(int i =1; i<=10; i++) {
			if(i % 2 == 0) {
				num = num - i;
			}else {
				num = num + i;
			}
		}
		System.out.println(num);
	}


	public static void prac06() {
		int num =0;
		int i =1;

		while(true) {
			if(num + i >=1000) {
				break;
			}
			num = num + i; //num합에 1을 누적하고 i++에서 2로 만들고 다시 누적 
			i++;
		}
		System.out.println("1000이 되기전 누적 합 : " + num);

		i=1;
		num = 0;
		while(true) {
			num += i;
			i++;

			if(num >=1000);{
				break;
			}
		}System.out.println("1000이 되기전 누적 합 : " + num);

	}


	public static void prac07() {
		Scanner scan = new Scanner(System.in);

		System.out.print("입력 : ");
		int num = scan.nextInt();

		if(1 <= num && num <=9) { //1단부터 9단까지 
			for(int i =1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + (num*i));
				System.out.printf("%d * %d = %d\n", num, i, (num*i));
			}
		}else {
			System.out.print("1부터 9까지만 입력 가능");
		}
	}


}