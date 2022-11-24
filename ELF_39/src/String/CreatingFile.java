package String;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException {
		
		File soma = new File("E://program/soma.txt");
		
		if(!soma.exists()) {
			soma.createNewFile();
			System.out.println("File created");
		}
		else {
			System.out.println("File already exists");
		}
		FileOutputStream f1=new FileOutputStream(soma);
		String s="Hello World ";
		f1.write(s.getBytes());
		
		
		FileInputStream fis = new FileInputStream(soma);
	
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
		i=fis.read();
		}
		fis.close();
		f1.close();
	}
}
