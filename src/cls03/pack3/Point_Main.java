package cls03.pack3;

public class Point_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lang = 50;
		int eng = 30;
		int math = 60;
		
		int[] langArr = new int[5];
		int[] engArr = new int[5];
		int[] mathArr = new int[5];
			 //index   1
		
		Point p1= new Point();
		
//		p1.lang = -30;
//		p1.eng = 500;
//		p1.math = 95;
		p1.setEng(500);
		p1.setLang(-30);
		p1.setMath(95);
		
		System.out.println(p1.lang);
		System.out.println(p1.eng);
		System.out.println(p1.math);
	}

}
