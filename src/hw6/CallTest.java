package hw6;

import java.util.Scanner;

public class CallTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x的值");
		int x = sc.nextInt();
		System.out.print("請輸入y的值");
		int y = sc.nextInt();
		
		Caculator c1 = new Caculator();
		
		int power1 = 0;
		try {
			power1 = c1.powerXY(x, y);
			System.out.println(power1);
		} catch (CallException e) {
		
			e.printStackTrace();
		}
		sc.close();
		
		
}
}
