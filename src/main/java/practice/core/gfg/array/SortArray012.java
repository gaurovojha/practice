package practice.core.gfg.array;

import practice.core.util.MyUtil;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortArray012 {

    public static void main(String[] args) {
        int[] arr = {2,1,2,1,0,0,0,1,1,1,2};
        sortArray(arr);
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        Stream.of(arr).forEach(System.out::println);

    }

    static void sortArray(int[] arr){
        //low=mid=0 high=arr.len
        int low = 0, mid = 0, high = arr.length-1;
        while(mid<=high){
            switch (arr[mid]){
                case 0:
                    MyUtil.swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    MyUtil.swap(arr, mid, high);
                    high--;
                    break;
            }
        }
        //case 0 : swap(arr[low++], arr[mid]) low--
        //case 1 : mid++
        //case 2 : swap(arr[high--], arr[mid]) high --

    }
}
