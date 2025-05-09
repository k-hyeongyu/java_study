package practice.practice43;

public class Kitchen {

	public static void main(String[] args) {
		
		Refrigerator r = new Refrigerator();
		r.brand = "SAMSUNG";
		r.liter = 10;
		r.powerOn();
		r.powerOff();
		r.tempUp();
		r.tempDown();
		r.door = 2;
		
		Deep_Freezer d = new Deep_Freezer();
		d.sphere = 8;
		d.price = 100000;
		
		Gas_stove g = new Gas_stove();
		g.stove = 4;
		g.brand = "SAMSUNG";
		g.price = 100000;
		g.powerOn();
		g.powerOff();
		g.fireStrength(3);
				
		Sink s = new Sink();
		s.width = 100;
		s.length = 100;
		s.depth = 100;
		s.color = "silver";
		s.meterial = "plastic";
		
		Trash t = new Trash();
		t.liter = 10;
		t.color = "ivory";
		t.closeTrash();
		t.emptyTrash(); 
		
		Cup c = new Cup();
		c.liter = 100;
		c.meterial = "glass";
		c.color = "white";
	}
}
