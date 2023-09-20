package hw4;

import java.util.Scanner;

public class HW4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		int year = sc.nextInt();
		int month = sc.nextInt();
		if(month > 12 || month < 1) {
			System.out.println("月份輸入錯誤，請輸入1~12");
		}
		int day = sc.nextInt();
		if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31 ) {
			System.out.println("日期輸入錯誤，最大只到31日");
		} else if((month == 4 || month == 6 || month == 9 || month ==11) && day > 30  ) {
			System.out.println("日期輸入錯誤，最大只到31日");
		} else if (isleapyear(year) && day > 29 ) {
			System.out.println("日期輸入錯誤，最大只到29日");
		}
		int dayofyear = caldayofyear(year,month,day);
		System.out.println("輸入日期為該年的第" + dayofyear + "天");
	}
	
	public static int caldayofyear(int year,int month,int day) {
		int dayofmonth[] = {0,30,31,30,31,30,31,31,30,31,30,31};
		if(isleapyear(year)) {
			dayofmonth[1] = 29;
		}
		
		int dayofyear = 0;
		for(int i = 0; i < month; i++ ) {
			dayofyear += dayofmonth[i];
		}
		
		dayofyear += day;
		return dayofyear;
		
	}
	
	public static boolean isleapyear(int year) {
		return (year % 4 == 0  && year % 100 != 0) || (year % 400 == 0); 
	}

}
