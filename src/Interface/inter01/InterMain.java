package Interface.inter01;

import java.util.*;

public class InterMain {

	public static void main(String[] args) {

		System.out.println(inter01.CODE);

		int topp = inter01.FISHBREAD_TOPPING_PPAT;

		ImpleClass c = new ImpleClass();
		c.method1();
		c.method2();

		inter01 i1  = new ImpleClass();
		i1.method1();
		i1.method2();

		inter01 i11 = new ImpleClass02();
		i11.method1();
		i11.method2();

		inter01 i22 = new ImpleClass02();
		i22.method2();

		inter01[] arr = {new ImpleClass(), new ImpleClass02()};

		List<inter01> list = new ArrayList<inter01>();
		list.add(new ImpleClass());
		list.add(new ImpleClass02());

		test1(c);
		test1(i11);
		test1(arr[0]);
		test1(list.get(1));

		inter01 if1 = test2(); //return inter01

		ImpleClass02 ic02 = (ImpleClass02)i11;
		if(i1 instanceof ImpleClass) {
			ImpleClass ic = (ImpleClass)i1;
		}

	}

	public static void test1(inter01 inter) {

	}
	public static ImpleClass test2() {
		return new ImpleClass();
	}

}
