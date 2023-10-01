package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class hw7_4 {
	public static void main(String[] args) throws Exception {
		pet[] plist = new pet[4];
		plist[0] = new Dog("dog1");
		plist[1] = new Dog("dog2");
		plist[2] = new Cat("Cat1");
		plist[3] = new Cat("Cat2");
		
		File folder = new File("C:\\data");
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		File newfile = new File("C:\\data\\Object.ser");
		newfile.createNewFile();
		
		//輸出
		FileOutputStream fos = new FileOutputStream(newfile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(int i=0;i < plist.length;i++) {
			oos.writeObject(plist[i]);
		}
		oos.close();
		fos.close();
		
		//輸入
		FileInputStream fis = new FileInputStream(newfile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(newfile.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while(true) {
				((pet)ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	}
}
		
		
			
	

