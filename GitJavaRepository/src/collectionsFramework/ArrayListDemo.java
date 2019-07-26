package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


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
		
		//Array List
		System.out.println("Sorting an integer list ");
		
		System.out.println("Before the list is sorted");
		System.out.println(alist);
		
		System.out.println("After the list is sorted");
		Collections.sort(alist);
		System.out.println(alist);
		
		//Linked List
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(50);
		//linkedList.add(3,66);
		linkedList.add(8);
		linkedList.add(19);
		linkedList.add(45);
		
//		System.out.println(linkedList);
		
		Iterator<Integer> itr = alist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
