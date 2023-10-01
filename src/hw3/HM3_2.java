package hw3;

import java.util.Scanner;

public class HM3_2 {
	public static void main(String[] args) {
		int rn = (int)(Math.random() * 10);
		System.out.println("開始猜數字!");
		Scanner sc = new Scanner(System.in);
		int gn = sc.nextInt();
		
		while(gn != rn) {
			if(gn > rn) {
				System.out.println("猜錯囉，太大了!");
			}
			else {
				System.out.println("猜錯囉，太小了!");
			}
			
			gn = sc.nextInt();
		}
			System.out.println("猜對囉!");
			sc.close();
	}
}
