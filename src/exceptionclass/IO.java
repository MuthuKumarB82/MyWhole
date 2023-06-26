package exceptionclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO {
	public static void main(String[] args) throws IOException ,FileNotFoundException,ClassNotFoundException {
		try {
			File f = new File("C:\\Users\\ADMIN\\Documents\\mk.text");
			FileReader fr = new FileReader(f);
			int temp = 0;
			while((temp = fr.read())!=-1) {
				System.out.println((char)temp);
//				System.out.print((char)temp);
			}
		} catch(Exception a) {
			a.printStackTrace();
		}
   }
}