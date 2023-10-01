package hw3;


import java.util.Scanner;

public class HM3_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個數字");
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		
		if(d1 == d2 && d1 == d3) {
			System.out.println("正三角形");
		}
		
		else if(d1 == d2 || d1 == d3 || d2 == d3) {
			System.out.println("等腰三角形");
		}
		else if ((d1*d1) + (d2*d2) == (d3*d3) || (d2*d2) + (d3*d3) == (d1*d1) || (d1*d1) + (d3*d3) == (d2 * d2)) {
			System.out.println("直角三角形");
		}
		else if(d1 != d2 || d2 != d3){
			System.out.println("其他三角形");
		}
		
		else {
			System.out.println("不是三角形");
		}

		sc.close();
	}
	
	
}
	
