package hw10;

public class HM10_1 {
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		} 
		boolean result = true;
		for(int i =2 ; i < n ; i++) {
			if( n % i == 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 5 ; i++) {
			int rn = (int)(Math.random() * 100 +1);
			
			if(isPrime(rn)) {
				System.out.println(rn + "是質數");
			}else {
				System.out.println(rn + "不是質數");
			}
		}
		
	}
}
