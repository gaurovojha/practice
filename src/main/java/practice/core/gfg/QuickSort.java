package practice.core.gfg;

import practice.core.util.MyUtil;

public class QuickSort {

    static int pivot = 0;

    public static void main(String[] args) {
        // partitioning
        int[] arr = {10,80,30,90,40,50,70};
        pivot = arr[arr.length-1];
        quickSort(arr, 0, arr.length-1);
    }


    private static void quickSort(int[] arr, int low, int high){
        int mid = partitioning(arr, low, high);
        System.out.println(mid);
        MyUtil.printArr(arr);
//        quickSort(arr, low, mid);
//        quickSort(arr, mid+1, high);
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




