package javaStrings;

import java.util.*;

public class ReverseStringWithStrBuffer 
{
	public static void main(String args[]) 
	{
		//declare string object and assign string
		StringBuffer str= new StringBuffer("Hello World!");
		
		//reverse the string
		str.reverse();
		
		//print the reversed string 
		System.out.println("String after reversing:" + str);
	}  
}
