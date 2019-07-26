package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class StringSortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("Zebra");
		strList.add("Liril");
		strList.add("Apple");
		strList.add("Yak");
		strList.add("Drums");
		strList.add("Queen");
		
		
		System.out.println("The array is ");
		System.out.println(strList);
		
		System.out.println("The array after sorting is ");
		Collections.sort(strList);
		System.out.println(strList);
		
		//strList.subList(2,4);
		
		System.out.println(strList.subList(2,4));
		
	}

}
