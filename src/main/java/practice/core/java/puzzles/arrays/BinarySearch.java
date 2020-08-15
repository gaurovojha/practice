package practice.core.java.puzzles.arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] inputArray = {10, 23, 41, 53, 67 , 87 ,98};

        System.out.println(binarySearch(inputArray, 23, 0, inputArray.length-1));
    }

    private static int binarySearch(int[] arr, int number , int low, int high){

        if(high>=low) {
            int mid = low + (high - low) / 2;

            if (number == arr[mid]) {
                return mid;
            }

            if (arr[mid] > number) {
                return binarySearch(arr, number, low, mid-1);
            }
            return binarySearch(arr, number, mid + 1, high);
        }
        return -1;
    }
}
