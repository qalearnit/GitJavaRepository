package collectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PSHashSetDemo {

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
		
	}

}
