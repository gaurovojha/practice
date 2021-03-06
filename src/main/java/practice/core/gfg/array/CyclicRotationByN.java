package practice.core.gfg.array;

import practice.core.util.MyUtil;

public class CyclicRotationByN {

    public static void main(String[] args) {

    }

    static void rotateByN(int[] arr, int n){
        //take temp = arr[arr.len]
        int[] temp = new int[n];
        for(int i=0; i<n ;i++){
            temp[i] = arr[i];
        }
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
//        arr[0] = temp;
        for(int i=0; i<n ;i++){
            temp[i] = arr[i];
        }
        MyUtil.printArr(arr);
    }
}
