package Examples;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExamples {

	public static void main(String[] args) {
		// 
		Collection<String> collection = new ArrayList<String>();
		collection.add("APPLE");
		collection.add("NOKIA");
		collection.add("RealMe");
		collection.add("LG");
		
		Iterator<String> iteratorOBJ = collection.iterator();

		while(iteratorOBJ.hasNext()) {
			System.out.println(iteratorOBJ.next()); 
		}
		
		System.out.print(collection);
		//Used To Show The Collection
	}

}
