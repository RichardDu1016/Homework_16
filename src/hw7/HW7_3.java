package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HW7_3 {
	
	public static void copyFile(File f1, File f2){
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader bfr = null;
		BufferedWriter bfw = null;
		

		try {
			fr = new FileReader(f1);
			fw = new FileWriter(f2);
			bfr = new BufferedReader(fr);
			bfw = new BufferedWriter(fw);
//			int c ;
//			while((c = bfr.read()) != -1) {
//				bfw.write(c);
//				System.out.flush();
//			}
//			fw.close();
//			fr.close();
			
			char[] ch = new char[1024];
			int c;
			while((c = bfr.read(ch)) != -1) {
				bfw.write(ch,0,c);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
				if(fw != null) {
					fw.close();
				}
				if(bfr != null) {
					bfr.close();
				}
				if(bfw != null) {
					bfw.close();
				}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
	
	public static void main(String[] args) {
		File inputFile = new File("inputfile.txt");
		File outputFile = new File("outputfile.txt");
		copyFile(inputFile, outputFile);
	}

}
