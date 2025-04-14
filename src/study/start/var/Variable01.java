package study.start.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 (값을 저장하는 공간)ex)박스 바구니 etc..
		
		//변수 선언
		int number1; //정수를 담는 numer1 이라는 이름의 바구니 
		int floor; //정수형 숫자를 담을 floor 라는 이름의 바구니
		
		int x, y, z;
//		int x; //중복으로 선언은 안됨
//		int y;
//		int z;
		
		int score; //변수만 선언후 값은 없음
		int point/*단순히 짓고 싶은 이름 아무거나*/ = 50;
		//변수선언 + 값을 저장도 하였음 ->
		//초기화를 하였다 point라는 상자에 50이라는 숫자를 넣었다
		
		//int = score = 99; //중복된 변수명은 사용불가
		score = 99; //단순히 score에 99라는 값은 넣은것뿐 int를 사용해 선언을 한것은 아님
		score = 80;
		score = 70; //프로그래머가 정한 값 리터럴 값
		
		int hour =3; //코드는 위에서 아래로 실행되지만 int변수값을 넣지 않았기 때문
		//변수 선언후 사용해야함
		
		//seconds = 21; // int변수선언 + 14값 저장 
		
		int minute = 14; //선언 안한 변수는 사용 불가
		
		minute = 21;
		minute = minute +7 ;
		score = point/*50*/ +20;  //최종 score = 70
		
		int totalScore = point + point +score + score;
		
		
		//기본 출력문
		//System.out.println(괄호 안에 있는 값/문자 출력);
		System.out.println("안녕하세요");
		System.out.println(500);
		System.out.println(totalScore);
		System.out.println(1+1+1+1+1+1);
		System.out.println(hour + "시" + minute + "분");
		
		x = 10;
		y =x;
		z = x+y;
		System.out.println(z);
		
		int a = 10;
		int b = 20;
		//a=10 , b=20
		//서로 바꾸기 ex) a=20 b=10
		
		int c = a; //a=10 b =20 c=10
		a = b;     // a=20 b=20 c=10
		b =c ;     //a=20 b=10 c=10
		
		
		
		
		
		
	}

}
