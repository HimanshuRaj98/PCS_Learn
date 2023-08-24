package Examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , Integer> ageMap = new HashMap<> ();
		
		ageMap.put("ND", 30);
		ageMap.put("Maikel", 28);
		ageMap.put("Mannnice", 50);
		ageMap.put("Martin", 42);
		
		System.out.print(ageMap);
		System.out.print("\n");
		Set<Entry<String, Integer>> set = ageMap.entrySet();
		Iterator<Entry<String, Integer>> mapIterator = set.iterator();
		
		while(mapIterator.hasNext()) {
			Entry<String, Integer> Object = mapIterator.next();
			System.out.println(Object.getKey());
			System.out.println(Object.getValue() + "\n");
		}
		
		
	}

}
