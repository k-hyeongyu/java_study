package refer;

public class Reference06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50};
		
		//기존방식
		int sum = 0;
		for(int i=0; i <arr.length; i++) {
			//sum += i; //0 1 2 3 4 인덱스 번호 
			sum += arr[i]; // 10 20 30 40 50
		}
		System.out.println(sum);
		
		System.out.println("=========================");
		
		sum = 0;
		int index = 0;
		for(int num/*arr의 값을 int num에 넣는다.*/ : arr) {
			sum += num;
			
			index++;
			if(index >= 3)
				break;
			//arr의 길이만큼 처음부터 끝까지 다 반복한다.
			//값만 주어짐, 인덱스는 모름 (인덱스가 필요하면 따로 처리해야한다.)
		}
		System.out.println(sum);
		
		System.out.println("=========================");
		
		int[] scores = {90,95,100,80,70}; //학생들 점수
		
		//채점 실수로 모두 -5점 처리가 필요한 상황
		
		for(int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		System.out.println("=========================");
		
		for(int score : scores) {
			score = score -5;
		}
		for(int i =0; i<scores.length; i++) {
			scores[i] = scores[i] - 5;
		}
		
		for(int score : scores) {
			System.out.print(score + " ");
		}
	
		
		
		
		
		
		
		
		
	}

}
