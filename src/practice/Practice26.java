package practice;

import java.util.Scanner;

public class Practice26 {

	public static void main(String[] args) {
		//basicV1();
		//basicV2();
		basicV3();
	}
	public static void basicV1() {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("탑승 인원 : ");
		int peopleCount = scan.nextInt();

		int[] destFloorArr = new int[peopleCount];

		System.out.print("층수 입력 :");
		for(int i=0; i < destFloorArr.length; i++) {
			destFloorArr[i] = scan.nextInt();
			//입력한 값이 2~100이 아니면 다시 입력
		}
		//1층 ~ 100층까지 목적지 층수에서 멈추기
		for(int i =1; i<=100; i++) { 
			System.out.println(i + " 층");
			//내리는 층인지 확인
			for(int j=0; j < destFloorArr.length; j++) {
				if(i == destFloorArr[j]) {
					System.out.println("====도착====");
				}
			}
		}
		//100층에서 1층으로 내려오기
		for(int i =100; i >=1; i--) { 
			System.out.println(i+" 층");
		}

	}
	public static void basicV2() {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("탑승 인원 : ");
		int peopleCount = scan.nextInt();

		int[] destFloorArr = new int[peopleCount];

		System.out.print("층수 입력 :");
		for(int i=0; i < destFloorArr.length; i++) {
			destFloorArr[i] = scan.nextInt();
			//입력한 값이 2~100이 아니면 다시 입력
		}
		//1층 ~ 100층까지 목적지 층수에서 멈추기
		int maxFloor = destFloorArr[0];


		for(int i =1; i<=destFloorArr.length; i++) { 
			System.out.println(i + " 층");
			//내리는 층인지 확인
			for(int j=0; j < destFloorArr.length; j++) {
				if(i == destFloorArr[j]) {
					System.out.println("====도착====");
				}
			}
		}


		//100층에서 1층으로 내려오기
		System.out.println("=====내려감=====");
		for(int i =destFloorArr.length; i >=1; i--) { 
			System.out.println(i+" 층");
		}

	}
	public static void basicV3() {

		int floor = 1;
		int flow = 1; //flow 1  -1 층의 진행방향을 의미, 층 값 변화 연산에 참여
		
		//1~100 -> 100 층에서 ~ 1층
		//1~최대층 -> 최대층에서 ~ 1층
		
		//flag
		while(true) {
			System.out.println(floor + "층");

			if(floor >= 100)
				flow = -1;

			if(floor <= 1 && flow == 1 )
				break;

			floor += flow;
		}
	}






}