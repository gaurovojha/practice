package practice.core.gaurov.problems.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * John works at a clothing store.
 * He has a large pile of socks that he must pair by color for sale.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 *
 * For example, there are  socks with colors .
 * There is one pair of color  and one of color .
 * There are three odd socks left, one of each color.
 * The number of pairs is .
 */
public class SockMerchant {
    public static void main(String[] args) {
        int[] testCase1 = {10,20,20,10,10,30,50,10,20};
        System.out.println(SockMerchant.coundSockPairs(testCase1));
        //System.out.println(SockMerchant.coundSockPairsJava8(testCase1));
    }

    private static int coundSockPairs(int[] sockArr){
        Map pairMap = new HashMap();
        int pairCount = 0;
        for(int i=0; i<sockArr.length; i++){
            if(pairMap.get(sockArr[i])!=null){
                pairMap.remove(sockArr[i]);
                pairCount++;
            }else{
                pairMap.put(sockArr[i],0);
            }
        }
        return pairCount;

    }

    /*private static int coundSockPairsJava8(int[] sockArr){
        Map pairMap = new HashMap();

        Stream.of(sockArr).forEach((i) -> {
            System.out.println(i);
        });

        int res = Arrays.stream(sockArr).forEach((i) -> {
            int pairCount = 0;
            if(pairMap.get(sockArr[i])!=null){
                pairMap.remove(sockArr[i]);
                pairCount++;
            }else{
                pairMap.put(sockArr[i],0);
            }
            return pairCount;
        });
        return 0;
    }*/
}



