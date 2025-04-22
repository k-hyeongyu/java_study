package refer;

public class Reference02 {

	public static void main(String[] args) {
		//참조변수 : 배열
		
		//배열이 없다면
		int score1 = 100;
		int score2 = 70;
		int score3 = 60;
		int score4 = 80;
		int score5 = 45;
		
		int sum = 0;
		
		sum = score1 + score2 + score3 +score4 + score5;
		double avg = sum / 5.0;
		
		System.out.printf("총점 : %d 평균 : %.2f \n", sum, avg);
		
		//배열 Array []똑같은 타입의 여러개의 데이터가 모여있음
		//배열은 참조변수임
		//int(정수형) 데이터를 가지는 배열 생성
		//scores, scoreArr, scoreArray
		
          		//index    0, 1, 2 ,3, 4
		int[] scoreArr = {100,70,60,80,45};
		//5개의 정수를 가진 배열
		
		System.out.println(scoreArr);
		
	
		System.out.println(scoreArr[0]);
		System.out.println(scoreArr[3]); //0부터 시작함으로 60
		System.out.println(scoreArr[4]);
		
		//System.out.println(scoreArr[0]); []인덱스의 범위를 주의
		
		sum =  scoreArr[0] + scoreArr[1] +scoreArr[2] + scoreArr[3] + scoreArr[4];
		avg = sum/3.0;
		System.out.printf("총점 : %d 평균 : %.2f \n", sum, avg);
		
		
		sum = 0;
		for(int i=0; i <5; i++) {
			sum  = sum + scoreArr[i]; 
		}
		avg = sum/3.0;
		System.out.printf("총점 : %d 평균 : %.2f \n", sum, avg);
		
		
		//int[] apintArr = {1,2,3,4,5}; 사용가능
		int[] pointArr = null; //참조변수임으로 null값도 가능 주소만 담고 있음
		pointArr =new int[] {1,2,3,4,5};
		
		pointArr = new int[5]; //5칸 생성
		pointArr[0] = 1;
		pointArr[1] = 2;
		pointArr[2] = 3; //2번째 자리에 3이라는 값을 넣음
		pointArr[3] = 4;
		pointArr[4] = 5;
		
		for(int i =0; i<5; i++) { //i : 0 1 2 3 4 
			//값은 1 2 3 4 5
			pointArr[i] = i+1;
		}
		for(int i =0; i<=5; i++) {
			pointArr[i-1] = i;
		}
		for(int i =0; i<=5; i++) {
			System.out.println(pointArr[i] + " ");
		}
		System.out.println();
		
//		int[] intArr = new int[6];
//		double[] doubleArr = new double[12];
//		boolean[] boolArr = new boolean[4];
//		String[] strArr = new String[20];
//		
//		intArr[3] = 9;		   // 0
//		intArr[0] = 1;
//		doubleArr[9] = 11.11;  //0
//		boolArr[3] = true;     //false
//		strArr[15] = "점심";    //스트링은 기본적으로 null값
//		
//		for(int i =0; i < intArr.length; i++) { //length는 기본적으로 변수설정 해놓은 값으로 자동세팅
//			System.out.print(intArr[i] + " ");
//		}
//		System.out.println();
//		
//		for(int i =0; i < doubleArr.length; i++) { //length는 기본적으로 변수설정 해놓은 값으로 자동세팅
//			System.out.print(doubleArr[i] + " ");
//		}
//		System.out.println();
//		
//		for(int i =0; i < boolArr.length; i++) { //length는 기본적으로 변수설정 해놓은 값으로 자동세팅
//			System.out.print(boolArr[i] + " ");
//		}
//		System.out.println();
//		
//		for(int i =0; i < strArr.length; i++) { //length는 기본적으로 변수설정 해놓은 값으로 자동세팅
//			System.out.print(strArr[i] + " ");
//		}
//		System.out.println();
	}
}
