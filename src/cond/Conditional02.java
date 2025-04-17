package cond;

public class Conditional02 {

	public static void main(String[] args) {
//		int dice = 2;
//		
//		if(dice ==1) {
//			System.out.println("한칸 전진");
//		} else {
//			System.out.println("1이 아닐떄 할 행동1");
//			System.out.println("1이 아닐떄 할 행동2");
//			System.out.println("1이 아닐떄 할 행동3");
//			}
//		if(dice ==1) {
//			System.out.println("한칸 전진");
//		} else {
//			System.out.println("1이 아닐떄 할 행동1");
//			System.out.println("1이 아닐떄 할 행동2");
//			System.out.println("1이 아닐떄 할 행동3");
//			}	
//		
//		if(dice ==1) {
//			
//		}else if(dice ==2) {
//		 
//		}else if(dice ==3) {
//			
//		}
		
		//if들끼리만 묶여있을 경우 안되는 케이스
		int menuPrice = 12001;
		
		if(menuPrice <=6000) {
			System.out.println("훌륭");
		}else if(menuPrice <= 8000) {
			System.out.println("선방");
		}else if(menuPrice <= 12000) {
			System.out.println("눈물");
		}else {
			System.out.println("물로 배채우기");
		}
		
		
		if(menuPrice > 12000) {
			System.out.println("물로 배채우기");
		}else if(menuPrice > 8000){
			System.out.println("눈물");
		}else if(menuPrice > 6000){
			System.out.println("선방");
		}else {
			System.out.println("훌륭");
		}
		//if조건문 -> 중첩 사용 가능
		
		if(menuPrice > 6000){
			if(menuPrice > 12000) {
			
		
			System.out.println("훌륭");
		}else if(menuPrice > 8000) {
			System.out.println("선방");
		}else if(menuPrice > 12000) {
			System.out.println("눈물");
		}else {
			System.out.println("물로 배채우기");
		}
	}
}
} 
