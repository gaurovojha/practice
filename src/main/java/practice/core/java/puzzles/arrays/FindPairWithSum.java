package practice.core.java.puzzles.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindPairWithSum {

    public static void main(String[] args) {
        int[] arr = { 8, 7, 2, 5, 3, 1 };
        int sum=10;
        findPair(arr, sum);

    }

    private static void findPair(int[] arr, int sum){

        Map map = new HashMap();
        for(int i =0;i <arr.length; i++){

            if(map.containsKey(sum - arr[i])){
                System.out.println("first index : " +map.get(sum - arr[i]) +"\nsecond index: "+arr[i]);
                return;
            }

            map.put(arr[i],i);
        }

    }
}
