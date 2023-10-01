package hw7;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class HW7_1 {

	static void p(String s){
		System.out.println(s);
	}	
	
	public static void main(String[] args) throws IOException{
//		File f1 = new File("C:/THA104_Workspace/Homework_16/Sample.txt");
		File inputFile = new File("C:/THA104_Workspace/Homework_16/Sample.txt");
		FileReader in = new FileReader(inputFile);
		BufferedReader br = new BufferedReader(in);
	
		String s;
		int countchar = 0;
		int countline = 0;
		while((s = br.readLine()) != null) {
			countchar += s.length();
			countline++;
		}
		br.close();
		in.close();
		
		 
		p(inputFile.getName() + " 檔案" + "共有 " + inputFile.length() + " 個位元組， " + countchar + " 個字元， " + countline + " 列資料");
	}
}
