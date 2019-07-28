package collectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class PSTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	}

}
