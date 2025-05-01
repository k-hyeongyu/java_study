package cls03.pack1;

import cls03.pack2.Cup;
/*상단에 import를 하면
본페이지에서 Cup클래스 사용시 import한 클래스로 인식*/


public class Cup_Main {

	public static void main(String[] args) {
		
		//상단에 import가 없으면, 동일 패키지클래스로 인식
		Cup c1 = new Cup();
		c1.method();
		
		cls03.pack2.Cup c2 = new cls03.pack2.Cup();
		c2.method();
		
		cls03.pack1.Cup c3 = new cls03.pack1.Cup();
		c3.method();
		
		//c2.b
		
	}

}
