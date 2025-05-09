package practice.practice41;


public class superTest {
	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc orc = new Orc("오크", 80);
			System.out.println(orc);
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior orcWarrior = new OrcWarrior("오크전사", 120, 3);
			System.out.println(orcWarrior);
	}
}
class Orc {
	//필드변수
	protected String name;
	protected int hp;

	//생성자
	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	//메소드
	@Override
	public String toString() {
		return  "Orc { name: "+ name +", hp: "+ hp +" }";
	}
}
class OrcWarrior extends Orc{
	//OrcWarrior만 갖고 있을 amor라는 새로운 필드변수
	protected int amor;

	//생성자
	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp); //super의 부모클래스의 생성자를 부른다
		this.amor = amor;
	}

	// 메소드 오버라이딩!
	@Override
	public String toString() {
		return "OrcWarrior { name: 오크전사, hp: 120, amor : 3 }";
	}
}
