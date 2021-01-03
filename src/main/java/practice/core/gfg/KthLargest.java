package practice.core.gfg;

import practice.core.util.MyUtil;

public class KthLargest {

    static int pivot = 0;

    public static void main(String[] args) {
        // partitioning
        int[] arr = {10,80,30,90,40,50,70};
        pivot = arr[arr.length-1];
        int k =2;
        kLargest(arr, 0, arr.length-1, k);
    }


    private static int kLargest(int[] arr, int low, int high, int k){
        int mid = partitioning(arr, low, high);
        if(k == mid){
            return arr[mid];
        }else if(k < mid){
            kLargest(arr, low, mid, k);
        }else{
            kLargest(arr, mid+1, high, k);
        }

        System.out.println(mid);
        MyUtil.printArr(arr);
//        quickSort(arr, low, mid);
//        quickSort(arr, mid+1, high);
        return -1;
    }

    private static int partitioning(int[] arr, int low, int high){
        int i = low - 1 ;

        for(int j = 0 ; j< high -1 ; j++){
            if( arr[j] < pivot){
                i++;
                MyUtil.swap(arr, i, j);
            }
            MyUtil.swap(arr, i+1, high);
        }
        return i+1;
    }


}




