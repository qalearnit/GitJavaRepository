package fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String textWrite = "This is one type of file from buffer Reader";
		
		File file = new File("S:\\FileIO\\buffer.txt");
		
		//BufferedInputStream bis = new BufferedInputStream(file);
		FileWriter fw = new FileWriter(file);
		BufferedWriter bwrite = new BufferedWriter(fw);
		
		bwrite.write(textWrite);
		
		System.out.println("File written Successfully");
		
		bwrite.close();
	}

}
