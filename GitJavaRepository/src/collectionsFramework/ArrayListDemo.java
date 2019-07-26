package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>alist= new ArrayList<Integer>();
		
		alist.add(15);
		alist.add(1, 19);
		alist.add(27);
		alist.add(2);
		alist.add(1);
		alist.add(217);
		
		System.out.println("Sorting an integer list ");
		
		System.out.println("Before the list is sorted");
		System.out.println(alist);
		
		System.out.println("After the list is sorted");
		Collections.sort(alist);
		System.out.println(alist);
	}

}
