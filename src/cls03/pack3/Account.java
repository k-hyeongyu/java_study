package cls03.pack3;

public class Account {

	private String name; //보안과 관련되었을 경우 private로 외부접근을 금지함.
	private String bank;
	private double rate;
	private double balance;
	
	public String getName() {
		return name; //name변수를 받아와서 값을 반환함
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
