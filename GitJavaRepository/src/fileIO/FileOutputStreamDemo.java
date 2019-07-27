package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Read the File
		String content="This is a text file where ip is given";
		
			File file = new File("s:\\FileIO\\New.txt");
				byte[] writeToFile = content.getBytes();
				
				FileInputStream fis = new FileInputStream(file);
				
				FileOutputStream fos= new FileOutputStream(file);
				
				fos.write(writeToFile);
								
				fos.flush();
				
				System.out.println("Written on file is done");

	}

}
