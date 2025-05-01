package cls03.pack3;

public class Point {
	private int lang;
	private int eng;
	private int math;
	String name; //점수 소유주의 이름
	
	public Point() {  //생성자는 public을 작성
		
	}
	
//	private Point() {/*private는 외부 접근 불가*/
//		
//	}
	
	

	//getter 값 가져오기 get하기(반환)  -> get필드명

	//setter 값 세팅 셋팅하기 -> set필드명

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	int getLang() {
		return lang;
	}
	
	int getEng() {
		return eng;
	}
	
	int getMath() {
		return math;
	}
	
	public void setLang(int lang) {
		//이부분은 메소드 영역이므로 코드 작성이 가능함.
		
		//잘못된 값들은 필터링이 가능하다.
		if(lang < 0)
			lang = 0;
		
		if(lang > 100)
			lang = 100;
		 
		if(lang < 0 || lang > 100) {
			System.out.println("범위를 벗어남, 저장불가");
			return;
		}
		
		
		this.lang = lang;
	}
	public void setEng(int eng) {
		
		if(eng > 100)
			eng = 100;
		
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}
