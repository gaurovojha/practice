package practice.core.leetcode.amazon;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class cq1 {

    /*public static int maxSubarrayLength(List<Integer> badges) {
        // Write your code here
        //track the first -ve
        int firstNegative = -1;
        int sum = 0;
        int max = 0;
        for(int i=0;i <badges.size(); i++){

            if(badges.get(i) < 1){
                sum++;
                if(firstNegative == -1) firstNegative =i ;
            }
            //sum is even
            if(sum%2 == 0) max = Math.max(i+1, max);
                //sum is odd
            else max = Math.max(i-(firstNegative+1)+1, max);
        }

        return max;


    }*/

    public static long findMaxProducts(List<Integer> products) {
        // Write your code here
        long result = products.get(0), temp = products.get(0);

        for(int i = 1 ; i < products.size(); i++){
            if(products.get(i) > products.get(i-1)){
                temp = temp + products.get(i);
            }else{
                long newTemp = temp - products.get(i-1) + products.get(i) + products.get(i-1) -1 ;
                System.out.println(newTemp);
                temp = Math.max(temp, newTemp);
            }

            result = Math.max(result, temp);

        }
        return result;
    }

    @Test
    public void testMe(){
        System.out.println(findMaxProducts(Arrays.asList(2,9,4,7,5,2)));
    }

}
