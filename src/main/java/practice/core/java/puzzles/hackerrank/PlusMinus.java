package practice.core.java.puzzles.hackerrank;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PlusMinus {
    public static void main(String[] args) {
        int[] input = {1,1,0,-1,-1};
        //System.out.println(new BigDecimal(2).divide(new BigDecimal(5), 6, RoundingMode.CEILING));

            plusminus(input);
    }

    public static void plusminus(int[] arr){
        //System.out.println(Arrays.stream(arr).filter(i -> i>0).count());
        Map<String, Integer> map = new HashMap<>();
        map.put("plus",0);
        map.put("minus",0);
        map.put("zero",0);

        for(int i = 0 ; i< arr.length ; i++){

            if(map.get("plus") + arr[i] > map.get("plus")){
                map.put("plus",map.get("plus")+1);
            }else if(map.get("minus") +  arr[i] < map.get("minus")){
                map.put("minus",map.get("minus")+1);
            }else{
                map.put("zero",map.get("zero")+1);
            }
        }
        System.out.println(new BigDecimal(map.get("plus")).divide(new BigDecimal(arr.length), 6, RoundingMode.CEILING));
        System.out.println(new BigDecimal(map.get("minus")).divide(new BigDecimal(arr.length), 6, RoundingMode.CEILING));
        System.out.println(new BigDecimal(map.get("zero")).divide(new BigDecimal(arr.length), 6, RoundingMode.CEILING));
    }


}
