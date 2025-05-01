package cls05;

public class Cls_Main {

	public static void main(String[] args) {
		
		int[] nArr = {10,20};
		int[] nArr2 = new int[5];
		
		Temp t1 = new Temp();
		Temp t2 = new Temp();
		Temp[] tArr = new Temp[3];
					  //공간만 만들어 놓은것
		
		Temp[] tArr3 = {new Temp(), new Temp(), new Temp()};
		
		t1.method();
		//tArr[0].method();
		tArr[0] = new Temp();
		tArr[1] = new Temp();
		tArr[2] = new Temp();
		
		
		for(int i =0; i < tArr.length; i++) {
			tArr[i] = new Temp();
			tArr[i].method();
		}
		System.out.println(methodA(30));
		
		t1.name = "t1";
		Temp result = methodB(t1);
		System.out.println(result.name);
		
		int[] result2 = methodC(nArr);
		for(int i=0; i<result2.length; i++) {
			System.out.print(result2[i]+ " ");
		}
	}	

	public static int methodA(int n) {
		return n + 30;
	}
	
	public static Temp methodB(Temp t) {
		
		System.out.println(t.name);
		
		Temp tt = new Temp();
		
		return tt;
	}
	public static int[] methodC(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		
		int[] result = {1,2,3,4};
		
		return result;
	}
	
	public static Temp[] methodD(Temp[] tArr) {
		for(int i=0; i<tArr.length; i++) {
			tArr[i].method();
		}
		for(Temp t : tArr) {
			t.method();
		}
		Temp[] arr = {new Temp(), new Temp(), new Temp()};
		
		return arr;
	}
	
	
}
