package hw7;



public class Dog extends pet {
	
	private static final long serialVersionUID = -8912134615404987502L;
	private String name;
	public Dog(String name) {
		super(name);
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
