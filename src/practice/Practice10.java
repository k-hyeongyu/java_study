package practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int lang = scan.nextInt();
		System.out.print("수학점수 : ");
		int math = scan.nextInt();
		System.out.print("영어점수 : ");
		int eng = scan.nextInt();
		
		int total = lang + math + eng;
		double avg = total/3.0;
		//      1              1        1       1
		if(lang  < 40 || math <40 || eng <40 || avg <60) {
			//각 과목의 점수가 40점 미만  평균 또한 60점 미만일때 불합격을 출력한다.
 			System.out.println("불합격입니다.");
		}else {
			System.out.println("국어점수 :" + lang);
			System.out.println("수학점수 :" + math);
			System.out.println("영어점수 :" + eng);
			System.out.println("합계 :" + total);
			System.out.println("평균 :" + avg);
			System.out.println("축하합니다. 합격입니다!");
		}
		
		
		
	}

}
