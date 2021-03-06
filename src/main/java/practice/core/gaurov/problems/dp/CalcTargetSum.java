package practice.core.gaurov.problems.dp;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.reflect.Array;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CalcTargetSum {

    public static void main(String[] args) {
        Map<Integer, Boolean> memo = new HashMap<>();
//        System.out.println(calcTargetSum(7, new int[]{2,3}, memo));
//        System.out.println(calcTargetSum(7, new int[]{5,3,4,7}, memo));
//        System.out.println(calcTargetSum(7, new int[]{2,4}, memo));
//        System.out.println(calcTargetSum(8, new int[]{2,3,5}, memo));
        Instant start = Instant.now();
        System.out.println(calcTargetSum(300, new int[]{7,14}, memo));
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println(timeElapsed);

    }

//    static boolean calcTargetSum(int targetSum, int[] numbers){
//        if (targetSum == 0)
//            return true;
//        if(targetSum > 0)
//            IntStream.of(numbers).peek(System.out::println).forEach(i -> calcTargetSum(targetSum-i, numbers));
//        return false;
//    }
//
//    true
//            true
//            false
//            true
//            false
//            4683

    static boolean calcTargetSum(int targetSum, int[] numbers, Map<Integer, Boolean> memo){
        if(memo.containsKey(targetSum)){
            return memo.get(targetSum);
        }
        //base cases
        if (targetSum == 0){
            return true;
        }
        if (targetSum < 0){

            return false;
        }

        for (int number : numbers) {
            int remainder = targetSum-number;
            if(calcTargetSum(remainder, numbers ,memo)){
                memo.put(targetSum, true);
                return true;
            }
        }
        memo.put(targetSum, false);
        return false;
    }

}
