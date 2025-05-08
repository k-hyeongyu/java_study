package inheritance.inheri01;

public class Child extends Parent {
	
	int grade;//학년
	String school; //학교이름
	
	//생성자가 쓰여 있지 않아도 기본 생성자가 있음
	public Child(){
		//상속받은 부모클래스 생성자
		super(0);
		
		//자식에서 해야할 일
		//this(10,"매개변수");
	}
	public Child(int money) {
		super(money);
		//this.money = money;
	}
	public Child(int grade, String school) {
		super(0);
		this.grade = grade;
		this.school = school;
	}
	public Child(int money, int grade, String school) {
		super(0);
		this.grade = grade;
		this.school = school;
	}
	public void play() {
		System.out.println("놀기");
	}
	public void printInfo() {
		System.out.println(grade + "학년" + school + "다님  돈 : " + money);
		System.out.println(age + "나이");
	}
	public void say() {
		System.out.println("어린이가 하는 말");
	}
//	public void donate() {
//		System.out.println("한달의 10기부");
//	}
	
}
