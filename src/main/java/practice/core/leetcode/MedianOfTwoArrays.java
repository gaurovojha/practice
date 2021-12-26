package practice.core.leetcode;

import practice.core.util.MyUtil;

public class MedianOfTwoArrays {

    public static void main(String[] args) {
//        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
//        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
//        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{2,3}));
//        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
//        System.out.println(findMedianSortedArrays(new int[]{2,2,4,4}, new int[]{2,2,4,4}));
        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{1,2,3,4,5}));
//        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{1}));
//        MyUtil.printArr(mergeSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr =  mergeSortedArrays(nums1, nums2);
        int abs = Math.abs(arr.length/2);
        if(abs==0){
            return arr[abs];
        }
        if(arr.length%2 == 0){
            return (double)(arr[abs-1] + arr[abs])/2;
        }else{
            return arr[abs];
        }
    }

    static int[] mergeSortedArrays(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        for(int k = 0, i= 0, j=0 ; k < m+n ; k++){
            if(j==n || (i<m && nums1[i] <= nums2[j]) ){
                arr[k] = nums1[i];
                i++;
            }else if(i==m || (j<n && nums2[j] <= nums1[i])){
                arr[k] = nums2[j];
                j++;
            }
        }
        return arr;
    }
}
