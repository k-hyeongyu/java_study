package practice27;

public class Person {

	//필드
	String name;
	String gender;
	int age;
	double height;
	double weight;
	String job;
	String bloodType;
	boolean isHealth;
	boolean isSleep;
	
	//생성자
	Person(/*비어있는 생성자*/){	
	}
	Person(String name, String gender, int age, double height,double weight, String job, String bloodType, boolean isHealth, boolean isSleep){
		this.name = name;
		this.gender =gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job =job;
		this.bloodType = bloodType;
		this.isHealth = isHealth;
		this.isSleep = isSleep;
	}
	//메소드 : 자체적으로 실행 가능
	void printPersonInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("체중 : " + weight);
		System.out.println("직업 : " + job);
		System.out.println("혈액형 : " + bloodType);
		System.out.println("건강여부 : " + isHealth);
		System.out.println("수면여부 : " + (isSleep ? "자는 중" : "깨어 있음"));
		System.out.println();
	}


}
