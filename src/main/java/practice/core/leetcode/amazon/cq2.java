package practice.core.leetcode.amazon;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class cq2 {
    Map<String,Integer> dp = new HashMap<>();

    public long increasingSubSequence(List<Integer> products){
        long temp = products.get(0);
        long max = products.get(0);
        for(int i=1; i< products.size() ; i++){
            if(products.get(i) > products.get(i-1)){
                temp += products.get(i);
            }else{
                temp = products.get(i);
            }
            temp = Math.max(temp, Objects.isNull(dp.get(i+"_"+products.get(i))) ? travelBack(products, i)
                    : dp.get(i+"_"+products.get(i)));
            max = Math.max(temp, max);
        }
        return max ;
    }


    public long travelBack(List<Integer> products, int index){
        int curr = products.get(index-1);
        int prev = products.get(index);
        int temp = prev;
        while(index > 0 && prev > 0){
            if(prev > curr){
                temp = temp + curr;
                prev = curr;
            }else{
                temp = temp + prev -1 ;
                prev = prev -1 ;
            }
            index --;
            curr = products.get(index);
        }
        dp.put(index+"_"+products.get(index), temp);
        return temp;

    }



    public long travelBack1(List<Integer> products, int index){

        if(index==0) return products.get(index);
        long temp = products.get(index);
        while(index > 0){
            long curr = products.get(index);
            long prev = products.get(index-1);
            if(curr > prev){
                temp = temp + prev;
            }else{
                temp = temp + curr -1 ;
                prev = curr -1 ;
            }
            System.out.println(prev);
            index = index-2;
        }
        return temp;

    }

    @Test
    public void test(){
        Assert.assertEquals(16, increasingSubSequence(Arrays.asList(2,9,4,7,5,2)));
//        System.out.println(travelBack(Arrays.asList(2,9,4,7,5,2), 4));
//        System.out.println(travelBack1(Arrays.asList(2,9,4,7,5,2), 5));
    }
}
