package practice.core.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {
    public static void main(String[] args) {

    }

    static int findDuplicate(int[] arr){
        Set numbers = new HashSet();
        for(int i=0;i<arr.length;i++){
            if(numbers.contains(arr[i])){
                return arr[i];
            }else{
                numbers.add(arr[i]);
            }
        }
        return -1;
    }
}
