package practice.practice35;

import java.util.*;

public class ChineseRestaurant {
	
	public static void main(String[] args) {
		
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);

		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		menuList.add(jjajang);
		menuList.add(jjambbong);
		menuList.add(tangsook);
		
		//Order order = new Order(123, menuArr);
		Order order = new Order(123, menuList);
		
		//주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
		
		ArrayList<Menu> menuList2 = new ArrayList<Menu>();
		menuList2.add(new Menu("짬뽕", 5900));
		menuList2.add(new Menu("짜장", 4900));
		menuList2.add(new Menu("탕수육", 13900));

		Order order2 = new Order(124, menuList2);
		System.out.println("[주문번호 %d] 주문합계 : %d원 \n");
	}
}