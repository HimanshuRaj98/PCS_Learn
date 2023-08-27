package Examples;

import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.ArrayList;

public class ListExample {


	public static void main(String[] args) {
		
		// ArrayList
		// LinkList
		
		List<String> list = new ArrayList<>();
		
		list.add("Windows");
		list.add("MacOS");
		list.add("Linux");
		list.add(0,"Windows98");
		
		System.out.print(list); //Used To Show The List
		
		Iterator<String> iteratorOBJ = list.iterator();
		
		while(iteratorOBJ.hasNext()) {
			System.out.println( iteratorOBJ.next() );
			//Used To Show The Element Of List
		}
		ListIterator<String> iteratorOBJRev = (ListIterator<String>) list.iterator();
		while(iteratorOBJRev.hasPrevious()) {
			System.out.print(iteratorOBJRev.previous());
		}
		
	}

}
