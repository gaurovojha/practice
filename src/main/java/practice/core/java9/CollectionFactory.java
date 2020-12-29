package practice.core.java9;

import java.util.*;

public class CollectionFactory {
    public static void main(String[] args) {
        //Prior java8 way of creating unmodifiable Collections
        Map<String, String> map = new HashMap<>();
        map.put("fName","Gaurov");
        map.put("lName","Gaurov");
        map.put("city","London");
        map = Collections.unmodifiableMap(map);

        List<String> list = Arrays.asList("test","test","test");

        map = Collections.unmodifiableMap(new HashMap<String,String>(){{
            put("fName","Gaurov");
            put("lName","Gaurov");
            put("city","Gaurov");
        }});

//        Set<String> set = Set.of("foo", "bar", "baz");






    }
}
