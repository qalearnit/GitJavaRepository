package fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterAppendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String appendStr= " Hey hows that man";
		File file = new File("S:\\FileIO\\buffer.txt");
		
		FileWriter fw;
		try 
		{
			fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(appendStr);
			System.out.println("Text appended successfully");
			
			bw.close();
			System.out.println("File Closed");
			
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
