package javaStrings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseByWord 
{
	public static void main(String[] args) 
	{
		// create object of the string.
		String S;
		
		Scanner scan = new Scanner (System.in);
		
		// enter your string here.
		System.out.print("Enter the string : ");
		// will read string and store it in "S" for further process.
		S = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(S, " ");

		// strReverseLine is the function used to reverse a string.
		String strReversedLine = "";
		try
		{
			while(st.hasMoreTokens())
			{
				strReversedLine = st.nextToken() + " " + strReversedLine;
			}
			System.out.println("Reversed string by word is : " + strReversedLine);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
