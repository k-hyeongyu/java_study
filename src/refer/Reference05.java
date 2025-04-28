package refer;

public class Reference05 {

	public static void main(String[] args) {

		int[] arr1 = {100,20,30};
		int[] arr2 = arr1;
		//배열은 참조변수
		//주소가 그대로 복사된다. 주소값이 들어있다
		
		
		System.out.println("arr1");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();

		
		//출력시 값은 동일 하지만 
		System.out.println("arr2");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr2[i] + " ");
		}
		System.out.println();
		
		arr1[0] = 100;
		
		System.out.println("arr1");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();

		
		//출력시 값은 동일 하지만 
		System.out.println("arr2");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr2[i] + " ");
		}
		System.out.println();
		
		
		int a = 10;
		int b = a;
		
		System.out.printf("a : %d b : %d     \n", a, b);
		
		a = 20;
		System.out.printf("a : %d  b : %d", a, b);
		
		
		//정수형 변수 : 주소(참조형 변수)
		//기본 타입에 참조 타입을 넣으려 하기 때문에 오류가 발생
		//int c = arr1; 
		
		int c = arr1[2];
		
		//arr1 -> arr3
		int[] arr3 = new int[3];
		
		//arr3 = arr1;
		for(int i =0; i<3; i++) {
			arr3[i] = arr1[i];
		}
		
		System.out.println("arr1");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();

		
		//출력시 값은 동일 하지만 
		System.out.println("arr3");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr2[i] + " ");
		}
		System.out.println();
		
		arr1[1] = 200;
		
		System.out.println("arr1");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();

		
		//출력시 값은 동일 하지만 
		System.out.println("arr2");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr2[i] + " ");
		}
		System.out.println();
		
		int[] arr4 = new int[3];
		//arr1 - > arr4
		System.arraycopy(arr1, 0, arr4, 0 , 3);
				//arr1의 0인덱스를 arr4의 0부터 3개를 복사한다.
		
		
		System.out.println("=============================");
		
		System.out.println("arr1");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();

		System.out.println("arr1");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();
		
		arr1[2] = 300;
		
		System.out.println("arr4");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr4[i] + " ");
		}
		System.out.println();

		System.out.println("arr1");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.println("arr4");
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr4[i] + " ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}