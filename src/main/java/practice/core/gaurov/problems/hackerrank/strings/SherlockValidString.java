package practice.core.gaurov.problems.hackerrank.strings;

import java.util.*;
import java.util.stream.IntStream;

public class SherlockValidString {

    public static void main(String[] args) {
        System.out.println(isValid("aaaaaaaaabbbbbbbbbcccccccccd"));
    }

    // Complete the isValid function below.
    static String isValid(String s) {

        int[] freq = new int[26];

        s.chars().forEach((c)->{
            freq[c-97]++;
        });

        int[] sortedFreq = IntStream.of(freq)
                .filter(i -> i >0)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i->i)
                .toArray();


        int len = sortedFreq.length;
        int max = sortedFreq[0];
        int min = sortedFreq[len-1];

        if(max - min == 0){
            return "YES";
        }

        if(sortedFreq.length>2){
            int secondMax = sortedFreq[1];
            int secondMin = sortedFreq[len-2];
            if((max-1 == min &&  secondMax == min )|| (min -1 == 0 && max == secondMin)){
                return "YES";
            }
        }else if(max-min<=1){
            return "YES";
        }
        return "NO";
    }

}
