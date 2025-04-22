package refer;

public class Reference04 {

	public static void main(String[] args) {
		//
		
		int[] arr1 = {1,2,3}; //정수 배열
		int[] arr2 = {1,2,3};  //arr1과 arr2는 값만 같고 주소는 다름
		int[] arr22 = arr2;
		
		
		System.out.println(arr1 == arr2); //값은 같지만 주소가 다름
		System.out.println(arr1[1] == arr2[1]);
		
		System.out.println(arr2 == arr22); 
		
		String[] arr3 = {"A","B","C"}; //문자열 배열
		String[] arr4 = {"A","B","C"};
		//참조변수는 기본적으로 어딘가를 가르키고 있다.
		
		System.out.println(arr3 == arr4);
		//System.out.println(arr3[0] == arr4[0]); //정확한 좌표를 지정하면 true가 나옴
		System.out.println(arr3[0].equals(arr4[0])); //String값은 보편적으로 .equals로 비교
		
		
		
		
		
		
		
		
	
	}

}
