package hw1;

public class hw1 {
	public static void main(String[] args){
		
// 1.請設計一隻Java程式,計算12,6這兩個數值的和與積
		int num1 = 12, num2 = 6;
				
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		
// 2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		int doz_egg = egg / 12;
		System.out.println("共 " + doz_egg + " 打，又 " + egg % 12 + " 顆蛋" );
		
		
// 3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec_PD = 60 * 60 * 24 ;
		int sec_Phr =  60 * 60 ;
		int sec_Pmin = 60;
		int sec_T = 256559 ;
		int day = sec_T / sec_PD;
		int hr = (sec_T - (sec_PD * day)) / sec_Phr;
		int min = (sec_T - (sec_PD * day) - (sec_Phr * hr)) / sec_Pmin;
		int sec_r = sec_T - (day * sec_PD) - (hr * sec_Phr) - (min * sec_Pmin);
		
		System.out.println(day + "天 " + hr + "小時又 " + sec_r + "秒");
		
// 4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		
		final double p = 3.1415;
		double r = 5;
		double a = p * Math.pow(r, 2);
		double l = 2 * p * r;
		
		System.out.printf("園面積為 %.2f，園周長為 %.2f。 ", a, l );

		
		
// 5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		int s_money = 1500000;
		int t = 10 ;
		double rate = 0.02;
		double rate_c = 1 + rate;
		double t10_money = s_money * Math.pow(rate_c, t);
		System.out.println(t10_money);
		
		
		
// 6.請請寫一隻程式,利用System.out.println()印出以下三個運算式結果:

		System.out.println(5+5);  //此處的+號為基本加法運算
		System.out.println(5+'5'); // 字元'5'的unicode值為53，因此等於 5 + 53 得到 58
		System.out.println(5+"5"); //此處+號為數字與字串相加，會達到文字串接的效果
		
		
		
	}
}
 