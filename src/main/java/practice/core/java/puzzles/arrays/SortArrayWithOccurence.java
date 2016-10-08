package practice.core.java.puzzles.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import practice.core.java.collection.SortingMaps;

/*
 * Given an array
 * Find the no of occurrence of a member
 * Sort the array w.r.t the occurrence
 */
public class SortArrayWithOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = {7,1,6,2,7,6,10,11,12,2,11,7,11,11};
		
		//printing sorted map with respect to occurrence
		SortingMaps.printMap(sortingMap(findingOccurrence(inputArr)));
	}
	
	public static Map<Integer, Integer> findingOccurrence(int[] inputArr){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer element : inputArr){
			if(map.containsKey(element)){
				map.put(element, map.get(element)+1);
			}else{
				map.put(element,1);
			}
		}
		return map;
	}
	
	public static Map<Integer, Integer> sortingMap(Map<Integer, Integer> unsortedMap){

		List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(unsortedMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {

			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
		
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		Map<Integer,Integer> sortedMap = new LinkedHashMap();
		for(Map.Entry<Integer, Integer> entry : list){
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
}
