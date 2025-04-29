package practice.practice28;

public class Monitor_main {

	public static void main(String[] args) {

		Monitor monitor1 = new Monitor(27, "삼성", "오딧세이");

		monitor1.print_Monitor_Spec();

		System.out.println("===========================");
		
		Monitor monitor2 = new Monitor(32, "LG", "울트라기어");

		monitor2.print_Monitor_Spec();

		System.out.println("===========================");

		
		Monitor monitor3 = new Monitor(34, "델", "에일리언웨어");

		monitor3.print_Monitor_Spec();
	}

}
