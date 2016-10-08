package practice.core.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SortingMaps {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//sortingStringKeys();
		sortingValues();
	}

	static void sortingValues() {
		List objList  = new A
				rrayList();
		objList.add(new Boolean(false));
		objList.add(new Integer(1));
		objList.add(new String("two"));
		Collections.sort(objList);
		
		Map<String, Integer> unsortMap = new HashMap();
		unsortMap.put("Z", 10);
		System.out.println(unsortMap.put("Z", 10));
		unsortMap.put("B", 5);
		unsortMap.put("A", 6);
		unsortMap.put("C", 20);
		unsortMap.put("D", 1);
		unsortMap.put("E", 7);
		unsortMap.put("Y", 8);
		unsortMap.put("N", 99);
		unsortMap.put("J", 50);
		unsortMap.put("M", 2);
		unsortMap.put("F", 9);
		printMap(unsortMap);
		System.out.println("*******************************");
		printMap(sortingMap(unsortMap));

	}
	
	public static Map<String, Integer> sortingMap(Map<String, Integer> unsortedMap){

		List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(unsortedMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {

			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		Map<String,Integer> sortedMap = new LinkedHashMap();
		for(Map.Entry<String, Integer> entry : list){
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}

	static void sortingStringKeys() {
		Map<String, String> unsortMap = new HashMap();
		unsortMap.put("Z", "z");
		unsortMap.put("B", "b");
		unsortMap.put("A", "a");
		unsortMap.put("C", "c");
		unsortMap.put("D", "d");
		unsortMap.put("E", "e");
		unsortMap.put("Y", "y");
		unsortMap.put("N", "n");
		unsortMap.put("J", "j");
		unsortMap.put("M", "m");
		unsortMap.put("F", "f");
		printMap(unsortMap);
		System.out.println("*******************************");
		Map<String, String> treeMap = new TreeMap<String, String>(unsortMap);
		printMap(treeMap);
	}

	public static <K, V> void printMap(Map<K, V> inputMap) {
		// TODO Auto-generated method stub
		for (Map.Entry<K, V> entry : inputMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + "Value : " + entry.getValue());
		}
	}
}