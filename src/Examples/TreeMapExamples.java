package Examples;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer , String> Students = new TreeMap<>();
		Students.put(1, "Neha");
		Students.put(2, "Shusma");
		Students.put(3, "Riya");
		Students.put(4, "Priya");
		
		Set<Entry<Integer, String>> setObject = Students.entrySet();
		Iterator<Entry<Integer, String>> studentIterator = setObject.iterator();
		while(studentIterator.hasNext()) {
			Map.Entry<Integer, String> Obj = studentIterator.next();
			System.out.print(Obj.getKey() + " ");
			System.out.print(Obj.getValue() + "\n");
		}		
	}

}
