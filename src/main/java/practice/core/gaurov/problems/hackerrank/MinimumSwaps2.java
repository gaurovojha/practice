package practice.core.gaurov.problems.hackerrank;

public class MinimumSwaps2 {

    public static void main(String[] args) {
        int[] input = {7,1,3,2,4,5,6};
        int[] input1 = {4,3,1,2};
        int[] input2 = {1, 3, 5, 2, 4, 6, 7};
        int[] input3 = {2, 3, 4, 1, 5};
        int[] input4 = {8, 9, 16, 15};
        int[] input5 = {1, 5, 4, 3, 2};
        System.out.println(minimumSwaps(input1));


    }
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int swapCount=0;

        for(int i = 0; i<arr.length-1; i++){
            if(!(arr[i]==i+1)){
                for(int j = i+1; i<arr.length-1; j++){
                    if(i+1 == arr[j]){
                        swap(arr,i,j);
                        swapCount++;
                        break;
                    }
                }
            }
        }
        return swapCount;
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i]= temp;
    }


}
