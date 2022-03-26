package practice.core.leetcode.amazon;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPurmutations {

    public List<List<Integer>> allPurmutationsNoDups(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backTrackoDups(res, new ArrayList<>(), nums);
        return res;
    }

    public void backTrackoDups(List<List<Integer>> res, List<Integer> tempList,
                          int[] nums){

        if(tempList.size() == nums.length){
            res.add(tempList);
        }else{
            for(int i=0; i< nums.length; i++){
                if(tempList.contains(nums[i]) ||
                        i> 0 && nums[i] == nums[i-1]) continue;
                List<Integer> subset = new ArrayList<>(tempList);
                subset.add(nums[i]);
                backTrack(res, subset, nums);
            }
        }
    }

    public List<List<Integer>> allPurmutations(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), nums);
        return res;
    }

    public void backTrack(List<List<Integer>> res, List<Integer> tempList,
                          int[] nums){

        if(tempList.size() == nums.length){
            res.add(tempList);
        }else{
            for(int i=0; i< nums.length; i++){
                if(tempList.contains(nums[i])) continue;
                List<Integer> subset = new ArrayList<>(tempList);
                subset.add(nums[i]);
                backTrack(res, subset, nums);
            }
        }
    }

    @Test
    public void allPurmutationsTest(){
        /*for(List<Integer> list : allPurmutations(new int[]{1,2,3})){
            System.out.println(list);
        }*/

        for(List<Integer> list : allPurmutations(new int[]{1,1,2})){
            System.out.println(list);
        }
    }
}
