package inheritance.inheri01;

public class Inheri_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1 = new Parent(1000);
		p1.say();
		p1.money = 1000;
		
		Child c1 = new Child();
		c1.money = 2000;
		c1.say();
		
		Child c2 = new Child(5000);
		c2.say();
		
		Child c3 = new Child(3000, 4, "대흥초");
		c3.play();
		c3.say();
		
		c3.donate();
		
		//c3.nightMeal();
	}

}
