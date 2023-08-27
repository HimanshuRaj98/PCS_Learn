package Examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> Data = new HashMap<>();
		
		Data.put("INDIA", 205);
		Data.put("England", 195);
		Data.put("Pakistan", 111);
		Data.put("Sri Lanka", 168);
		
		System.out.print(Data);
		
		for(Map.Entry<String , Integer> entry : Data.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
