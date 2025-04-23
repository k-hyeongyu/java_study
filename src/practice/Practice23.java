package practice;

import java.util.Scanner;

public class Practice23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] menuName = {"아메리카노", "카페 라떼", "바닐라 라떼"};
		int[] price = {3500, 4100, 4300};
		int[] count = new int[3];
		
		//int menuCount1 = 0;
		//int menuCount2 = 0;
		//int menuCount3 = 0;

		while(true) {
				System.out.println("=========메뉴========");
				for(int i =0; i <menuName.length; i++) {
					System.out.printf("%d. %s %d원\n", i+1, menuName[i], price[i]);
				}
				System.out.println("===================");
	
				System.out.print("메뉴 선택 : ");
				int menu = scan.nextInt();
	
				if(1> menu || menu > 3) {
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
					continue;
				}else{
					System.out.print("수량 선택 : ");
					int qty = scan.nextInt();
					count[menu - 1] += qty;
				}
	
				System.out.print("추가 주문 하시겠습니까?(y?n) : ");
				String add = scan.next();
	
				if(add.equals("n")) {
					break;
				}else if(!add.equals("y")){
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
		}

		System.out.println("=======주문 내역=========");
		int total = 0;

				for(int i =0; i <menuName.length; i++) {
					if(count[i] > 0) {
						int sum = count[i] * price[i]; 
						total += sum;
						System.out.printf("%s %d잔 : %d원\n",menuName[i], count[i], sum);
					}
		
				}
		System.out.println("총액 : " + total + "원");
	}
}
