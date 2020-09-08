package practice.core.gaurov.problems.hackerrank.strings;

import java.util.HashMap;
import java.util.Map;

public class AlternatingCharacters {
    // Complete the alternatingCharacters function below.
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));
    }
    static int alternatingCharacters(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
       for(int i=0 ; i< s.length()-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
        }
        return count;
    }
}
