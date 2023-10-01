package hw7;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class HW7_2 {

	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fs = new FileOutputStream("C:/THA104_Workspace/Homework_16/outputrandnum.txt",true);
			PrintStream p = new PrintStream(fs);
			
			for(int i = 0; i < 10; i++) {
				Random r = new Random();
				int num = r.nextInt(1000) + 1;
				p.print(num + " ");
			}
			p.println();
			
			p.close();
			try {
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
}
}
