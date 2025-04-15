package oper;

public class Operator01 {

	public static void main(String[] args) {
		//산술연산자
		System.out.println(1+1);
		System.out.println(2-1);
		System.out.println(3*2);
		System.out.println(4/2);
		System.out.println(9%5); // 9/5의 값은 1 나머지는 4
		System.out.println();
		
		//부호연산자
		System.out.println(30);
		System.out.println(+30);
		System.out.println(-30);
		System.out.println(-(-30));
		
		//증감 연산자
		System.out.println("--------증감----------");
		
		int x = 10;
		int y = 20;
		int z = 30;
		
		System.out.println(x--); //원래 x값인 10출력 ,현재 줄이 끝나고
		System.out.println(x);	// 이미 연산이 끝난 9로 출력된다. 원본데이터의 값이 바뀜
		
		System.out.println(++y); //먼저 + y값은 21 출력
		System.out.println(y); // y:21
		
		System.out.println(z+1); //31 단순계산
		System.out.println(z); // 30 단순계산 원래값
		System.out.println();
		
		int q = 1;
		int w = 3;
		int e = 10 + ++q; // 10 + 2 =12
		int r = 3 + w--;  // 3 + 3
		
		System.out.printf("%d %d %d %d \n\n", q,w,e,r);
		
		//논리 부정 연산 ! true <--> false
 		boolean isHungry = true;
 		System.out.println(isHungry);
 		System.out.println(!isHungry); //초기연산값 그대로 데이터 변화 X
 		System.out.println(isHungry);  //원본이 바뀌지 않아 초기데이터값 그대로 출력
 		
 		System.out.println("===========비교연산=============");
 		System.out.println( 10==10 ); //둘이 같다.
 		System.out.println( 5!=5 ); //다르다
 		System.out.println(5>3); //크다
 		System.out.println(5>=3); //크거나 같다
 		System.out.println(5<3);
 		System.out.println(5<=3);
 		System.out.println();
 		boolean b1 = (9>=8); //true
 		System.out.println(b1);
 		
 		//논리연산자 &&논리곱AND 
 		boolean b2 = (10>6) && (10>5); //true && true = true
 		System.out.println(b2);
 		
 		boolean b3 = (5 != 1) || (10 <4); // true || false = true
 		System.out.println(b3);
 		
 		boolean b4 = (2>=1) && !(3<4);
 					 //true && false = false
 		System.out.println(b4);
 		
 		System.out.println("=======대입 연산자=======");
 		int a =30; //30을 a라는 박스에 저장한다.
 		
 		//복합대입
 		a += 5; //a = a+5;
 		a -= 3; //a = a-3;
 		a *= 3; //a = a*3;
 		a /= 2; //a = a/2;
 		a %= 4; //a = a%4; 
 		
 		//삼항연산자
 		//(조건식) ? 앞 : 뒤  || 조건식에서 참일경우 앞 거짓일 경우 뒤
 		int point = 250;
 		
 		String item = (point >= 100) ? "커피" : "생수";
 		System.out.println(item);
 		
 		item = (point < 100) ? "생수" : "커피";
 		// point >= 100  --> point <100
 		// pont  > 50   ----> point <=50

 		//이벤트 음료의 조건
 		// 0  ~ 100 : 생수
 		//101 ~ 200 : 커피
 		//201 ~     : 맥주
 		//(조건식) ? 앞 : (조건식) ? 앞 : 뒤
 		
 		
 		point = 201;
 		item = (point <= 100) ? "생수" : (point > 200 ? "맥주" : "커피");
 				//점수가 100이하		   //포인트가 200미만
 		//포인트가 100이하면 생수 200미만이라면 커피 그 외에는 맥주
 		System.out.println(item);
 		
 		
 		
 		item = (point <= 200) ? (point > 100 ? "커피" : "생수") : "맥주"; 
 		System.out.println(item);
	}

}
