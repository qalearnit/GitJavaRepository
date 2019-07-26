package javaStrings;

import java.util.Scanner;

public class CountNoOFWords {
	
	public static int countWords(String str)
	{
		String[] strArr = str.split(" ");
		
		StringBuilder strBuilder = new StringBuilder();
		
		int count=0;
		
		for(String s: strArr)
		{
			if(!s.equals(" "))
			{
				count++;
			}
		}
		
		return count;		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("No. of Words in String : "+countWords(str));

	}

}
