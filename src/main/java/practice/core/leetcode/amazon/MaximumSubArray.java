package practice.core.leetcode.amazon;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubArray {


    public int maxSubArray(int[] input){
        int maxSoFar = input[0];
        int maxEndingHere = input[0];
        for (int i=1 ;i<input.length; i++){
            maxEndingHere = Math.max(maxEndingHere+input[i], input[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;

    }

    public int maxSubArrayDP(int[] input){
        int maxSoFar = input[0];
        int sum = input[0];
        for (int i=1 ;i<input.length; i++){
//            sum = (sum + input[i]) >0 ? sum + input[i] : input[i];
            sum =  input[i] + (sum + input[i] > 0 ? sum  : 0);
            maxSoFar = Math.max(maxSoFar, sum);
        }
        return maxSoFar;

    }

    public int maxSubArray1(int[] A) {
        int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];

        for(int i = 1; i < n; i++){
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;
    }


    @Test
    public void testMaxSubArray(){
        Assert.assertEquals(4,maxSubArray(new int[]{1,-1,-1,-1,1,1}));
//        Assert.assertEquals(23,maxSubArray(new int[]{5,4,-1,7,8}));
//        Assert.assertEquals(6,maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
//        Assert.assertEquals(1,maxSubArray(new int[]{1}));
    }
    @Test
    public void testMaxSubArrayDP(){
        Assert.assertEquals(23,maxSubArrayDP(new int[]{5,4,-1,7,8}));
        Assert.assertEquals(6,maxSubArrayDP(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        Assert.assertEquals(1,maxSubArrayDP(new int[]{1}));
    }

    @Test
    public void testMaxSubArray1(){
//        Assert.assertEquals(23,maxSubArray1(new int[]{5,4,-1,7,8}));
        Assert.assertEquals(6,maxSubArray1(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
//        Assert.assertEquals(1,maxSubArray1(new int[]{1}));
    }
}
