package practice.practice27;

public class Person_Main {

	public static void main(String[] args) {
		//프로그램의 시작 지점
		Person person = new Person(); //기본 생성자 사용

		person.name = "홍길동";
		person.gender = "M";
		person.age = 20;
		person.height = 180;
		person.weight = 70;
		person.job = "Engieneer";
		person.bloodType = "AB";
		person.isHealth = true;
		person.isSleep = true; 


		System.out.println("이름 : " + person.name);
		System.out.println("성별 : " + person.gender);
		System.out.println("나이 : " + person.age);
		System.out.println("신장 : " + person.height);
		System.out.println("체중 : " + person.weight);
		System.out.println("직업 : " + person.job);
		System.out.println("혈액형 : " + person.bloodType);
		System.out.println("건강여부 : " + person.isHealth);
		System.out.println("수면여부 : " + (person.isSleep ? "자는 중" : "깨어 있음"));
		
		System.out.println("====================================");
		
		Person p2 =new Person("이름이", "F", 29, 162.1, 62.1,"학생", "O", false, true);
		
		System.out.println("이름 : " + p2.name);
		System.out.println("성별 : " + p2.gender);
		System.out.println("나이 : " + p2.age);
		System.out.println("신장 : " + p2.height);
		System.out.println("체중 : " + p2.weight);
		System.out.println("직업 : " + p2.job);
		System.out.println("혈액형 : " + p2.bloodType);
		System.out.println("건강여부 : " + p2.isHealth);
		System.out.println("수면여부 : " + (p2.isSleep ? "자는 중" : "깨어 있음"));
		System.out.println();
		
		person.printPersonInfo();
		p2.printPersonInfo();

		Person p3 = new Person();
		p3.printPersonInfo();		
	}
	
}