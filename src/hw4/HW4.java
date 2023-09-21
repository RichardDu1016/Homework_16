package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		
//		作業一
		int array[] = {29,100,39,41,50,8,66,77,95,15};
		int sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		
		float avg = sum / array.length;
		System.out.println(sum);
		System.out.println((int)avg);
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > avg) {
				System.out.print(array[i] + " ");
			}
		}
		
//		作業二
		String s = "Hello World";
		for(int i =10; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		
//		作業三
		String array_s[] = {"mercury","venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		for(int i = 0; i < array_s.length;i++) {
			for(int j =0; j < array_s[i].length(); j++) {
				if(array_s[i].charAt(j) == 'a' ||  array_s[i].charAt(j) == 'e' || array_s[i].charAt(j) == 'i' || array_s[i].charAt(j) == 'o' |array_s[i].charAt(j) == 'u' ) {
					count++;
				} 
			}
		}
		
		System.out.println(count);
		
//		作業四
		int array1[][] = {{25,32,8,19,27},{2500,800,500,1000,1200}};
		Scanner sc = new Scanner(System.in);
		System.out.println("要借的金額：");
		int wbm = sc.nextInt();
		int count1 = 0;
		int cbc[] = new int[5];
		
		for(int i = 0 ; i <= array1[1].length -1; i++) {
			if(array1[1][i] >= wbm) {
				cbc[i] = array1[0][i];
				count1++;
			}
			else {
				System.out.println("沒人有錢");
			}
		}
		System.out.print("有錢可以借的員工編號：");
		for(int i =0; i <= cbc.length -1; i++) {
			System.out.print(cbc[i] + " ");
		}
		System.out.print("共　"+ count +"　人！");
		
	
			 
////    作業六
		int arrayTest[][] = {{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},
							 {100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},
							 {98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}};
		
		int copyTest[][] = new int[6][];
		int highestSC[] = new int[8];
		for(int i = 0; i < arrayTest.length; i++) {
			copyTest[i] = Arrays.copyOf(arrayTest[i],8);
			Arrays.sort(copyTest[i]);
		}
		
		for(int i = 0; i < arrayTest.length;i++) {
			for(int j = 0; j < arrayTest[i].length; j++) {
				if(arrayTest[i][j] == copyTest[i][7]) {
					highestSC[i] += 1;
				}
			}
		}
				
		for(int i = 0; i < highestSC.length; i++) {
			System.out.println( (i + 1) +" 號同學考了 " + highestSC[i] + " 次最高分");
		} 

			 }
}
		

		
		
		
		
		
		
		
		



	

