package hw7;



public class Cat extends pet {
	
	private static final long serialVersionUID = -1863681887616520520L;
	
	private String name;
	
	public Cat(String name) {
		super(name);
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
