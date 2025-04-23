package practice;

public class Practice18 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[1].length; j++) {
				if(i == j){
					arr[i][j] = 1;
				}else if(i > j) {
					arr[i][j] = 3;
				}else if(i < j) {
					arr[i][j] = 2;
				}
			}
		}
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		

		//		for(int i = 0; i<5; i++) {
		//			for(int j=0; j<5;j++) {
		//				if(i == j){
		//					arr[i][j] = 1;
		//				}else if(i > j) {
		//					arr[i][j] = 3;
		//				}else if(i < j) {
		//					arr[i][j] = 2;
		//				}
		//			}
		//		}
		//		for(int i = 0; i<5; i++) {
		//			for(int j=0; j<5;j++) {
		//				System.out.println(arr);
		//			}
		//			System.out.println();
		//		}
		//		
	}
}
