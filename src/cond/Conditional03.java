package cond;

public class Conditional03 {

	public static void main(String[] args) {
		//조건문 switch
		
		
		/* if문은 범위를 잡을수 있다
		 * if(dice >= 1 && dice <= 3) {
		 * 
		 * }
		 */
		int dice =1;
		
		switch(dice) {
		case 1:     	 //dice == 1
			System.out.println("dice값이");
			System.out.println("1이다");
		case 2:			 //dice == 2
			System.out.println("2이다");
			break;
		case 3:			 //dice == 3
			System.out.println("3이다");
		default:         //else
			System.out.println("default 이다");
		}
		
	}

}
