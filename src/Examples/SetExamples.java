package Examples;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class SetExamples {

	public static void main(String[] args) {
		// HashSet
		// LinkedHashSet
		// TreeSet
		Set<String> setOBJ = new HashSet<String>();
		
		setOBJ.add("Airtel");
		setOBJ.add("BSNL");
		setOBJ.add("JIO");
		setOBJ.add("IDEA");
		setOBJ.add("JIO"); //No Duplication Is Allowed Here
		
		Iterator<String> iteratorObj = setOBJ.iterator();
		while(iteratorObj.hasNext()) {
			System.out.print(iteratorObj.next());
			System.out.print(" ");
		}
	}

}
