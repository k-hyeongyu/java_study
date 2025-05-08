package inheritance.inheri02;

import inheritance.inheri01.Parent;

public class HiddenChild extends Parent {

	public HiddenChild(){
		super(0);
	}
	
	public void printInfo() {
		System.out.println(money);
	}
}
