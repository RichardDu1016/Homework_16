package hw5;
import java.util.Random;

public class HM5_5 {
	public static void main(String[] arge) {
		getAuthCode();
	}
	
	public static void getAuthCode() {
		
		// 26 + 26 + 10 英文字大小寫各26個 + 數字 10個
		int basecode[] = new int[62];
		//
		for(int i =0; i < basecode.length; i++ ) {
			if(i < 10) {
				basecode[i] = 48 + i;  //數字ascii碼從48開始
			}else if(i < 36) {
				basecode[i] = 55 + i; //英文大寫從 65 開始，但i從10 開始，因此65-10
			}else {
				basecode[i] = 61 + i;
			}
		}
		
		int randcode[] = new int[8];
		
		Random r = new Random();
		for(int i = 0; i < randcode.length; i++) {
			randcode[i] = basecode[r.nextInt(62)];
			System.out.print((char)randcode[i]);
		}
		
	}
}
