package practice.core.von;

import java.util.Arrays;

public class WidestRectangle1 {

    static int largestArea(int[] X, int[] Y)
    {

        int len = X.length;
        Arrays.sort(X);
        int[] diff = new int[len-1];
        for(int i=0; i<len-1;i++) {
            diff[i] = X[i+1] - X[i];
        }
        Arrays.sort(diff);
        return diff[len-2];
    }

    // Driver Code
    public static void main(String args[])
    {
        int[] arr1 = {6,10,1,4,3};
        int[] arr2 = {6,10,1,4,3};
        largestArea(arr1, arr2);
    }
}

