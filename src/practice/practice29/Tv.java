package practice.practice29;

public class Tv {
	//필드
	String company;
	int year;
	int inch;
	
	
	//생성자는 일회용
	Tv(String company, int year, int inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	//메소드
	void show() {
		System.out.println(company + "제품 " + year + "년형 " + inch + "인치 TV");
	}
}
