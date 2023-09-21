package hw5;

public abstract class Pen {
	private String brand;
	private  double price;
	
	public Pen() {
		
	}
	
	public Pen(String brand,double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
		}
	
	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price){
		if(price > 0) {
			this.price = price;
		}else {
			System.out.println("請確認售價");
		}
	}
	
	public abstract void write();
	
}

	class Pencial extends Pen{
		
		
		public void write() {
			System.out.println("削鉛筆再寫");
		}
		
		public Pencial(String brand, double price) {
			super(brand, price);
		}
		
		public double getPrice() {
			return super.getPrice() * 0.8;
		}
		
		
		
	}
	
	class InkBrush extends Pen{
		public void write() {
			System.out.println("沾墨汁再寫");
		}
		public InkBrush(String brand, double price) {
			super(brand,price);
		}
		
		public double getPrice() {
			return super.getPrice() * 0.9;
		}
	}
