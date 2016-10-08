package practice.core.java.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestingMaps {

	public static void main(String args[]) {
		Map<String, String> hashMap = new HashMap<String, String>();
		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();

		hashMap.put("Gaurov", "Ojha");
		hashMap.put("Gaurov", "sharma");
		
		hashMap.put("Gaurov1", "sharma");
		hashMap.put("Gaurov2", "sharma");

		//linkedHashMap.put("Gaurov", "Ojha");
		linkedHashMap.put("Gaurov", "sharma");
		linkedHashMap.put("Gaurov1", "sharma");
		linkedHashMap.put("Gaurov2", "sharma");
		linkedHashMap.put("Gaurov", "sharma");

		
		System.out.println("Hash Map elements"+hashMap.toString());
		System.out.println("Linked Hash Map elements"+linkedHashMap.toString());
	}

}
