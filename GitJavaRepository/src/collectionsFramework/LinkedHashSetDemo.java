package collectionsFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
