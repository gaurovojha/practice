package practice.core.leetcode.dp;

import java.util.HashMap;

public class Fibnocci {

    static HashMap map = new HashMap();



    public static void main(String[] args) {
        // 1 1 2 3 5 8 13
//        System.out.println(fib(5));
//        System.out.println(fib(6));
//        System.out.println(fib(7));
//        System.out.println(fib(8));
        System.out.println(fib(10));

    }

    private static int fib(int i){
        map.put(1,1);
        map.put(2,1);
        if(map.containsKey(i)) {
            System.out.println(String.format("found u...{%s}", i));
            return (int)map.get(i);
        }
        int result = fib(i-2) + fib (i-1);
        map.put(i, result);
        return result;
    }
}
