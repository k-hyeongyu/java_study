package cls03.pack3;
//설계도
public class Person {

	public String name;
	private String job;
	private int age;
	public boolean health;
	
	
	//자동으로 메소드 만들기
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isHealth() {
		return health;
	}
	public void setHealth(boolean health) {
		this.health = health;
	}
	
	
}
