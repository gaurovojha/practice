package practice.core.gaurov.interview;

import java.util.*;
import java.util.stream.Collectors;

public class BlackRockAnagram {

    public static void main(String[] args) {
        List<String> text = Arrays.asList("code","doce","ecod","framer","frame");
        List<String> result = new ArrayList<>();

        Set<String> set = new HashSet<>();

        for(String str : text){

            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedString = new String(charArr);
            if(!set.contains(sortedString)){
                set.add(sortedString);
                result.add(str);
            }
        }
        Collections.sort(result);
        result.forEach(System.out::println);
    }
}
