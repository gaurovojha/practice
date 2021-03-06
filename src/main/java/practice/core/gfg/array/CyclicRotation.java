package practice.core.gfg.array;

import practice.core.util.MyUtil;

public class CyclicRotation {

    public static void main(String[] args) {
        rotateByOne(new int[]{1,2,3,4,5,6});

    }

    static void rotateByOne(int[] arr){
        //take temp = arr[arr.len]
        int temp = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        MyUtil.printArr(arr);
    }
}
