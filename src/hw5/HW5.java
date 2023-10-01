package hw5;
import java.util.Scanner;
public class HW5 {

	public static void main(String[] args) {
	// 第一題 --------------------------------------	
	Scanner num = new Scanner(System.in);
	System.out.println("請輸入寬度:");
	int width = num.nextInt();
	System.out.println("請輸入高度:");
	int height = num.nextInt();
	starSquare(width, height);
	num.close();
	// 第一題 --------------------------------------
	
	// 第二題 --------------------------------------
	System.out.println("本次亂數結果：");
	randAvg();
	// 第二題 --------------------------------------
		
	// 第三題 --------------------------------------	
	int intArray[][] = {{1,6,3},{9,5,2}};
	double doubleArray[][] = { {1.2, 3.5, 2.2},{7.4, 2.1, 8.2}};
	System.out.println(maxElement(intArray));
	System.out.println(maxElement(doubleArray));
	// 第三題 --------------------------------------	
	
	
	}
	
	
	
	
	// 第一題 --------------------------------------
	public static void starSquare(int width,int height) {
		for(int i = 0; i < height ; i++) {
			
			for(int j =0 ; j < width ; j++) {
				System.out.print("*");
		}
			System.out.println("*"); 
	}
	}
	// 第一題 --------------------------------------

	// 第二題 --------------------------------------	
	public static void randAvg() {
		int randnum_array[] = new int[10];
		
		double total = 0;
		for(int i = 0; i < 10; i++) {
			int randnum = (int)(Math.random() * 101);
			randnum_array[i] = randnum;
			System.out.print(randnum_array[i] + " ");
			total += randnum_array[i];
		}
		double avg = total / 10;
		System.out.println();
		System.out.println(avg);
	}
	// 第二題 --------------------------------------
	
	// 第三題 --------------------------------------
	public static int maxElement(int x[][]) {
		int temp = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++ ) {
				if(temp < x[i][j]) {
					temp = x[i][j];
				}
			}
		}
		return temp;
	}
	
	public static double maxElement(double x[][]) {
		double temp = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++ ) {
				if(temp < x[i][j]) {
					temp = x[i][j];
				}
			}
		}
		return temp;
	}
	// 第三題 --------------------------------------
	
	
}

