package Examples;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMaps {
		public static void main (String[] args) {
			LinkedHashMap <Integer , String > varHashMap = new LinkedHashMap<>();
			varHashMap.put(100 , "Maths");
			varHashMap.put(89 , "Physics");
			varHashMap.put(75 , "Hindi");
			varHashMap.put(91 , "English");
			
			Set<Entry<Integer, String>> varSet = varHashMap.entrySet();
			Iterator<Entry<Integer, String>> mapIterator = varSet.iterator();
			
			while(mapIterator.hasNext()) {
				Map.Entry<Integer, String> run = mapIterator.next();
				System.out.print(run.getKey() + " " + run.getValue() + "\n");
			}
		}
}
