package hw10;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HM10_3 {
	public static void main(String[] args) {
		System.out.println("請輸入日期(年月日，例如：20110131)");
		 Scanner sc = new Scanner(System.in);
		 String date = sc.next();
		 
	
		 if(isVailDate(date)) {
			 System.out.println("(1)年/月/日 (2)月/日/年 (3)日/月/年");
			 int ch = sc.nextInt();
			 switch(ch) {
			 case 1 :
				DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyyMMdd");
				System.out.println("年/月/日："+ LocalDate.parse(date,formatter1));	
				break;
			case 2 :
				DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMddyyyy");
				System.out.println("月/日/年："+ LocalDate.parse(date,formatter2));
				break;
			case 3 :
				DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("ddMMyyyy");
				System.out.println("年/月/日："+ LocalDate.parse(date,formatter3));
				break;
			default:
				System.out.println("請輸入正確選項");
			 }
		 }else {
			 System.out.println("請輸入有效的日期格式(yyyyMMdd)的格式");
		 }
		
		
		 sc.close();
	}
	
	public static boolean isVailDate(String date) {
		String datepattern = "\\d{8}";
		Pattern pattern = Pattern.compile(datepattern);
		Matcher matcher = pattern.matcher(date);
		return matcher.matches();
	}
	}

