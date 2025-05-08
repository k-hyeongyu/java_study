package inheritance.inheri01;

public class Parent extends GrandParent{

	//public int money; //아무곳에서나 접근 가능
	protected int money;
	
//	public Parent() {
//		System.out.println("Parent() 생성자");
//	}
	
	public Parent(int money) {
		this.money = money;
	}
	
	public void say() {
		System.out.println("부모님 말씀");
	}
	public final void donate() {
		System.out.println("한달에 100기부");
	}
	private void nightMeal() {
		System.out.println("야식");
	}
}
