package practice.practice28;

public class Monitor {
	
	//속성(필드)
	int inch;
	String company;
	String model;
	
	//생성자
	Monitor(int inch, String company,String model){
		this.inch = inch;
		this.company =company;
		this.model = model;
	}
	
	//메소드
	void print_Monitor_Spec() {
		System.out.println("인치 : " + inch);
		System.out.println("제조사 : " + company);
		System.out.println("모델명 : " + model);
	}
}
