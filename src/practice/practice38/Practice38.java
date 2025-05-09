package practice.practice38;

public class Practice38 {

	public static void main(String[] args) {
		// 객체 생성 및 초기화
		Novice novice = new Novice();
		novice.name = "프로도";
		novice.hp = 100;

		Wizard wizard = new Wizard();
		wizard.name = "해리포터";
		wizard.hp = 120;
		wizard.mp = 100;

		// 두 객체의 펀치
		novice.punch();
		wizard.punch();
		// 위자드 객체의 파이어볼
		wizard.fireball();
	}
}

		class Novice {
			String name;
			int hp;
		
			public void punch() {
				System.out.printf("[%s]의 펀치!!\n", name);
			}
		}
		
		/* 1. Wizard 클래스를 Novice 클래스로부터 확장하세요. */
		class Wizard extends Novice {
			int mp;  //mp만 써도 되는 이유는 novice(부모 클래스)에서 name과 hp가 선언되어 있음
		
			public void fireball() {
				System.out.printf("[%s]의 파이어볼!!\n", name);
			}
		}
