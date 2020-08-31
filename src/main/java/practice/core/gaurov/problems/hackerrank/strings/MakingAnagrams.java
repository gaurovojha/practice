package practice.core.gaurov.problems.hackerrank.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

    public static void main(String[] args) {
        //System.out.println(makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
        //System.out.println(numberNeeded("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
        System.out.println(numberNeeded("cde","abc"));
    }

    static int makeAnagram(String a, String b) {
        int res = a.length() + b.length();

        Map map = new HashMap();

        for(char c: a.toCharArray()){
            if(map.get(c)!=null){
                map.put(c,(int)map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for(char c: b.toCharArray()){
            if(map.get(c)!=null){
                if((int)map.get(c)>1){
                    map.put(c,(int)map.get(c)-1);
                }else{
                    map.remove(c);
                }
                res = res-2;
            }
        }

        return res;

    }

    public static int numberNeeded(String first, String second) {
        int[] freq = new int[26];
        first.chars().forEach((c) -> {
            freq[c - 97]++;
        });
        second.chars().forEach((c) -> {
            freq[c - 97]--;
        });
        return Arrays.stream(freq).map(Math::abs).sum();
    }


}
