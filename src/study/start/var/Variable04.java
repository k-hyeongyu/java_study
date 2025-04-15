package study.start.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 -> 문자열
		//문자열 -> 숫자
		String s1 = "1234";
		
		int n1 = 50;
		
		System.out.println(s1+n1);
		//숫자형 String -> int 변환

		int n2  = Integer.parseInt(s1);
			//  = Integer.parseInt(문자열); 문자열을 int형 숫자로 변환한다.
		
		System.out.println(n1+n2);
		System.out.println(n1+Integer.parseInt(s1));
		
		String s2 = "12.13";
		
		double d1 = Double.parseDouble(s2);
				//	Double.parseDouble(문자열);
				//  문자열을 실수형 double로 변환
		
		System.out.println(d1);
		
		boolean b1 = true;
		b1 = false;
		
		String s3 = "false";
		boolean b2 = Boolean.parseBoolean(s3);
		
		String s4= String.valueOf(true);
		String s5= String.valueOf(1512);
		String s6= String.valueOf(155.222);
		
		String s7= 1512 + "";
	}

}
