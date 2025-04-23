package practice;

public class Practice21 {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
// 		1번		
//		int num = 1;
//			for(int i=0; i<arr.length; i++) {
//				for(int j=0; j<arr.length; j++) {
//					arr[i][j] = num;
//					num++;
//				}
//			}
//			for(int i=0; i<arr.length; i++) {
//				for(int j=0; j<arr.length; j++) {
//					System.out.print(arr[i][j] + " ");
//				}
//				System.out.println();
//			}

		//2번
		int num =1;
		for(int i=0; i<arr.length; i++) { //i : 0
			for(int j=0; j<arr.length; j++) { //j:0 1 2 3 
				arr[i][j] = num;
				num++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		/*
		int num = 1;

		for(int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				arr[i][j] = num;
				num++;
			}
		}
		for(int i=3; i>=0; i++) {
			for(int j=3; j>=0; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
		 */	
		//4번
	     
	}
}
