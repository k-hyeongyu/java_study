package practice.practice35;

import java.util.ArrayList;

public class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	//Menu[] menus;
	ArrayList<Menu> menuList;
	
	// 생성자
	/*
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}*/
	public Order(int i, ArrayList<Menu> menuList) {
		orderNum = i;
		this.menuList = menuList;
	}
	
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		int sum = 0;
		
		for(int i =0; i<menuList.size(); i++) {
			sum += menuList.get(i).price;
		}
		/*for(int i =1; i<=menus.length ; i++) {
			sum += menus[i].price;
		}*/

		return sum;
	}
}
