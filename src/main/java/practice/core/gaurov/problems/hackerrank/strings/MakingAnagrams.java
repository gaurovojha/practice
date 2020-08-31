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

    // Complete the makeAnagram function below.
    static int makeAnagram1(String a, String b) {
        int res = a.length() + b.length();
        int n = a.length()>b.length() ? a.length() : b.length();
        Map temp = new HashMap();
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        for(int i=0; i<n ;i++){
            //if(temp.get(aArr[i]) || temp.)
            //temp.
        }

        return res;

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
