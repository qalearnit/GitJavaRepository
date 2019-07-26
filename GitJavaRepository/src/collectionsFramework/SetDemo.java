package collectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//HashSet
		Set<Integer> setOne = new HashSet<Integer>();
		setOne.add(19);
		setOne.add(9);
		setOne.add(19);
		setOne.add(188);
		setOne.add(219);
		
		System.out.println("HashSet output is below ::>>");
		
		System.out.println(setOne);
		
		System.out.println("Order is not preserved with HashSet");
		
		//TreeSet
		Set<Integer> setTwo = new TreeSet<Integer>();
		setTwo.add(122);
		setTwo.add(7);
		setTwo.add(1999);
		setTwo.add(93);
		setTwo.add(5);
		
		System.out.println("TreeSet output is below ::>>");
		
		System.out.println(setTwo);
		
		System.out.println("The values are displayed in SortedOrder with TreeSet");
		
		
		//LinkedHashSet
		Set<Integer> setThree = new LinkedHashSet<Integer>();
		setThree.add(122);
		setThree.add(7);
		setThree.add(1999);
		setThree.add(93);
		setThree.add(32);
				
		System.out.println("Linked HashSet output is below ::>>");
		
		System.out.println(setThree);
		
		System.out.println("Insertion Order is preserved with LinkedHashSet");
	}

}
