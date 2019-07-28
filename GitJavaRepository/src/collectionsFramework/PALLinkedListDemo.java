package collectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PALLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Linked List
				List<Integer> linkedList = new LinkedList<Integer>();
				linkedList.add(50);
				//linkedList.add(3,66);
				linkedList.add(8);
				linkedList.add(19);
				linkedList.add(45);
				
//				System.out.println(linkedList);
				
				Iterator<Integer> itr = linkedList.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
	}

}
