package practice.core.java.puzzles.arrays;

public class FindArrayRotation {

    public static void main(String[] args) {

        //sorted in ascending order
        int[] inputArray = {10, 23, 41, 53, 67 , 87 ,98};

        int[] rotatedArray = {53, 67 , 87 , 98, 10, 23, 41};

        int[] rotatedArray1 = {41, 53, 67 , 87 ,98 , 10, 23};

        int result = findArrayRotation(rotatedArray1);
        if(result==-1){
            System.out.println("No Rotation Found");
        }else{
            System.out.println("Rotation Found At : "+ result);
        }
    }


    /**
     * O(n) solution
     * @param arr
     * @return
     */
    private static int findArrayRotation(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return -1;
    }

    /**
     * O(logn) solution
     * @param arr
     * @return
     */
    private static int findArrayRotationWithRecursion(int[] arr, int low, int high){

        if(high >= low){
            if(arr[low]>arr[high]){
                return high;
            }else{
                int mid = low + (high-low)/2;
                return findArrayRotationWithRecursion(arr, low, mid);
                //return findArrayRotationWithRecursion(arr, mid+1, high);
            }
        }
        return -1;
    }

}
