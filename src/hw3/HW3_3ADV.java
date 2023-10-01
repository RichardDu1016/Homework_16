package hw3;

import java.util.Scanner;

public class HW3_3ADV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你不喜歡的數字");
		int dn = sc.nextInt();

		int seamotherNum[] = new int[6];
		
		int count = 0;
		while(count < 6) {
			
			int randomNum = (int)(Math.random()* 49 -1);
			if(randomNum % 10 != dn && randomNum / 10 != dn) {
				seamotherNum[count] = randomNum;
				count++;
			}
		}
		System.out.println("媽祖託夢的數字是；");
		for(int i=0; i<6; i++) {
			System.out.print( seamotherNum[i]+ " ");
		}
		
		sc.close();

			}
		
		}
		

	
