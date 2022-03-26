package practice.core.leetcode.amazon;

import org.junit.Test;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {
    public List<List<Integer>> findPowerSetRecursive(int[] nums){

        if(nums.length<0) return null;
        List<List<Integer>> result = new ArrayList<>();
//        result.add(new ArrayList<>()); //Adding empty list
        Arrays.sort(nums);

        backTrackSolution(result, new ArrayList<>(), nums, 0);


        return result;
    }

    public void backTrackSolution(List<List<Integer>> result, List<Integer> tempList,
                                  int[] nums, int start){
            result.add(tempList);
//            if(start == nums.length) return;
//        for(int i= start ; i < nums.length; i++){
//            List<Integer> subSet = new ArrayList<>(tempList);
//            subSet.add(nums[i]);
//            backTrackSolution(result, subSet, nums, i+1);
//        }
        for(int i= start ; i < nums.length; i++){
            tempList.add(nums[i]);
            backTrackSolution(result, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }


    }


    @Test
    public void findPowerSetRecursionTest(){
        for(List<Integer> list : findPowerSetRecursive(new int[]{1,2,3})){
            System.out.println(list);
        }
    }



    public List<List<Integer>> findPowerSetIterative(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); //Adding empty list
        for(int num : nums){
            //for each existing list
            int size = result.size();
            for(int i=0; i < size; i++){
                List<Integer> tempList = new ArrayList<>(result.get(i));
                tempList.add(num);
                result.add(tempList);
            }
        }
        return result;
    }

    @Test
    public void findPowerSetIterativeTest(){
        for(List<Integer> list : findPowerSetIterative(new int[]{1,2,3})){
            System.out.println(list);
        }
    }


}
