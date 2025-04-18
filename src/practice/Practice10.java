package practice;

public class Practice10 {

	public static void main(String[] args) {
		
		System.out.println("=======1번=======");
		
		int i;

		for(i=0; i<=10; i++) {
			System.out.println(i);
		}

		System.out.println("=======2번=======");

		for(i=1; i<10; i++) {
			System.out.println(i);
		}

		System.out.println("=======3번=======");

		for(i=10; i<=100; i+=10) {
			System.out.println(i);
		}

		System.out.println("=======4번=======");

		for(i=25; i<=100; i+=25) {
			System.out.println(i);
		}

		System.out.println("=======5번=======");

		i = 50;
		while(i<=55) {
			System.out.println(i);
			i++;
		}

		System.out.println("=======6번=======");

		i = 10;
		while(i>=1) {
			//i--; 를 아래 넣지 않고 위에 넣게 되면 시작부터 감소를 하고 9로 시작을 하게 된다.
			System.out.println(i);
			i--;
		}

		System.out.println("=======7번=======");

		i = 30;
		while(i >= 0) {
			System.out.println(i);
			i -=5;
		}
		
		System.out.println("=======8번=======");

		i = 30;
		while(i >= 5) {
			System.out.println(i);
			i -=5;
		}
		
		System.out.println("=======9번=======");

		i = 25;
		while(i >= 0) {
			System.out.println(i);
			i -=5;
		}



















	}

}
