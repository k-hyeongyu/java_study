package practice;

public class Practice25 {

	public static void main(String[] args) {

		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
		//배열에 10가지의 숫자를 넣는다
		int maxScore = scores[0]; //maxScore에 초기값을 0번 박스 첫번째인 88을 넣는다
		int minScore = scores[0]; //minScore에 초기값을 0번 박스 첫번째인 88을 넣는다
		int sum = 0; //sum은 0으로 잡아 놓는다
		int count80 = 0; //80이상도 0으로 잡아놓는다

		for(int i =0; i<scores.length; i++) { //score배열의 길이만큼 반복한다
			if(scores[i] > maxScore) { //score배열에 들어있는것들을 88부터 비교한다
				maxScore = scores[i];  //가장 큰값을 maxscore변수값에 저장한다.
			}
			if(scores[i] < minScore) { //score배열에 들어있는것들을 88부터 비교한다
				minScore = scores[i];  //가장 작은값을 minscore변수값에 저장한다.
			}

			sum = sum + scores[i]; //0인 sum에 scores배열의 모든 수들을 합한다.

			if(scores[i] > 80) { //만약 배열내의 점수들중 80이 넘는 숫자
				count80++;  //80넘는 숫자들의 갯수를 체크하여 count80에 체크된 갯수를 저장한다.
			}

		}

		double avg = (double)sum/scores.length; //실수 avg 변수를 선언하고 총점 sum을 배열의 길이인 10만큼 나누고
		//실수로 변환하다.

		System.out.println("최고점수 : " + maxScore);
		System.out.println("최저점수 : " + minScore);
		System.out.println("평균점수 : " + avg);
		System.out.println("80이상 학생 수 : " + count80 + "명");

//		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
//
//		int max = scores[0];
//		
//		for(int i =0; i<scores.length; i++) {
//			if(scores[i] > max) {
//				max = scores[i];
//			}
//		}
//		
//		int min = scores[0];
//		for(int i =0; i<scores.length; i++) {
//			if(scores[i] < min) {
//				min = scores[i];
//			}		
//				}
//		
//		int sum = 0;
//		for(int i =0; i<scores.length; i++) {
//			sum = sum + scores[i];
//		}
//		double avg = (double)sum/scores.length;
//		
//		int count = 0;
//		for(int i =0; i<scores.length; i++) {
//			if(scores[i] > 80) {
//				count += 1;
//			}
//		}
//		System.out.printf("최고점수 : %d\n", max);
//		System.out.printf("최저점수 : %d\n", min);
//		System.out.printf("평균점수 : %2f\n", avg);
//		System.out.printf("80이상 학생 수 : %d명\n", count);
		
	}
}
