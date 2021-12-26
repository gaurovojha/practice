package practice.core.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestNonRepeatingSubStr {

    public static void main(String[] args) {
//        System.out.println(longestNonRepeatingSubStr("abcabcbb"));
//        System.out.println(longestNonRepeatingSubStr("bbbbb"));
//        System.out.println(longestNonRepeatingSubStr("pwwkew"));
//        System.out.println(longestNonRepeatingSubStr("a"));
        System.out.println(longestNonRepeatingSubStr("abcdeafbdgcbb"));
        System.out.println(fastLongestNonRepeatingSubStr("abcdeafbdgcbb"));

    }


    public static int longestNonRepeatingSubStr(String str){
        if(str.isEmpty()) return 0;
        int n = str.length();
        int i =0,j = 0;
        Set s = new HashSet();
        int max = 0;
        while(i< n && j< n){
            if(!s.contains(str.charAt(j))){
                s.add(str.charAt(j++));
                max = Math.max(max, j-i);

            }else{
                s.remove(str.charAt(i++));
            }
        }
        return max;
    }

    public static int fastLongestNonRepeatingSubStr(String str){
        if(str.isEmpty()) return 0;
        Map<Character, Integer> map = new HashMap();
        int max = 0;
        for(int i= 0 ,j = 0; j< str.length(); j++){
            if(map.containsKey(str.charAt(j))){
                i = Math.max(map.get(str.charAt(j)), i);
            }
            map.put(str.charAt(j), j+1);
            max = Math.max(max, j-i +1);
        }
        return max;
    }

}
