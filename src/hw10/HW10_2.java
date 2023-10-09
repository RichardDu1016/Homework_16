package hw10;

import static java.lang.System.out;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class HW10_2 {
	public static void main(String[] args) {
		
		System.out.println("請輸入數字");
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextDouble()) {
			String  num = sc.next();
			 
			System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
			 int ch = sc.nextInt();
			 switch(ch) {
			 case 1 :
				 Format dfm1 = new DecimalFormat("#,###.00");
				 out.println(dfm1.format(num));
				 break;
			case 2 :
				 Format dfm2 = new DecimalFormat("#,###%");
				 out.println(dfm2.format(num));
				 break;
			case 3 :
				 Format dfm3 = new DecimalFormat("#.#E00");
				 out.println(dfm3.format(num));
				 break;
			default:
				System.out.println("請輸入正確選項!");
			 }
		}else {
			System.out.println("請輸入有效數字");
		}
		 sc.close();
	}
	
}
