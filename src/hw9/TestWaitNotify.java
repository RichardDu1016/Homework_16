package hw9;

class Livingmoney {
	private int bankaccount = 0;
	
	synchronized void income(int money) {
		while(bankaccount > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		bankaccount += money;
		System.out.println("媽媽存了" + money + "，帳戶共有：" + bankaccount);
		notify();
	}
	
	synchronized void spend(int money) {
		while(bankaccount < money) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		bankaccount -= money;
		System.out.println("熊大領了" + money + "，帳戶共有：" + bankaccount);
		if(bankaccount < 2000) {
		System.out.println("媽媽被熊大要求匯款");
		notify();
		}
		
	}
}

	class bigbear extends Thread {
		private Livingmoney livingmoney;
		public bigbear(Livingmoney livingmoney) {
			this.livingmoney = livingmoney;
		}
		public void run() {
			for(int i = 1; i <= 10; i++) {
				livingmoney.spend(1000);
			}
		}
	}
	
	class mom extends Thread{
		private Livingmoney livingmoney;
		public mom(Livingmoney livingmoney) {
			this.livingmoney = livingmoney;
		}
		
		public void run() {
			for(int i = 1 ; i <= 10; i++) {
				livingmoney.income(2000);
			}
		}
	}
public class TestWaitNotify {
	public static void main(String[] args) {
		Livingmoney	 livingmoney = new Livingmoney();
		bigbear bigbear = new bigbear(livingmoney);
		mom mom = new mom(livingmoney);
		bigbear.start();
		mom.start();
	}
}
