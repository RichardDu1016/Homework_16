package hw3;

import java.util.Scanner;

public class HW3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你不喜歡的數字");
		int dn = sc.nextInt();
		
		int array[][] = new int[7][7];
		int array_r[][] = new int[7][7];
		for(int i=0; i<=6; i++) {
			for(int j=0; j<=6; j++) {
				array[i][j] = 7 * i  + j +1 ;
//				System.out.print(array[i][j] + " ");
		}
//			System.out.println();
		}

		int ccs = 0;
		for(int i=0; i <= 6; i++) {
			for(int j=0; j<=6; j++) {
				if(array[i][j] % 10 != dn && array[i][j] / 10 != dn ) {
					array_r[i][j] = array[i][j];
					System.out.print(array[i][j] + " ");
					ccs += 1;
					
			}
			
		}
			System.out.println();	
	}
		System.out.println("你可以選得數字共有：" + ccs + "個");
		
	sc.close();	
}
	
}
