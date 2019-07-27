package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIODemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String content = "This is the first time with file IS and File OS";
		
		//Create a file
		File file = new File("S:\\FileIO\\New.txt");
				
		boolean createdFile=file.createNewFile();
		
		if(createdFile)
		{
			System.out.println("File is Created");
		}
		
		else
		{
			System.out.println("File not created");
		}
		
	}

}
