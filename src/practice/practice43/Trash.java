package practice.practice43;

public class Trash extends Kitchen{

	int liter;   
	String color;
	String meterial;
	boolean isOpen;
	
	public void openTrash() {
        isOpen = true;
        System.out.println("쓰레기통이 열렸습니다.");
    }

    // 쓰레기통을 닫는다
    public void closeTrash() {
        isOpen = false;
        System.out.println("쓰레기통이 닫혔습니다.");
    }
}
