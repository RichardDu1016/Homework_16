package hw9;

public class Bigeatter  implements Runnable{
int counter = 10 ;
int rice = 1;
private String eater_name ;


public Bigeatter(String eater_name) {
	this.eater_name = eater_name;
}

public void run() {
	while(counter > 0) {
			System.out.println(eater_name + "吃第" + rice + "碗飯");
	
	counter--;
	rice++;
	int rms = (int)(Math.random()*2501 + 500);
	try {
		Thread.sleep(rms);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}	
	}
	
	if(counter == 0) {
		System.out.println(eater_name + "吃完了!");
	}
}

public static void main(String[] args) {
	Bigeatter be1 = new Bigeatter("饅頭人");
	Thread t1 = new Thread(be1);
	Bigeatter be2 = new Bigeatter("詹姆士");
	Thread t2 = new Thread(be2);
	t1.start();
	t2.start();
	
}
}
