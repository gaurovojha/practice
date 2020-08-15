package practice.core.java.puzzles.arrays;

public class SortBinaryArray {

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,0,1};
        sortBinaryArray(arr);
    }


    public static void sortBinaryArray(int[] arr){
        int x=0, y=arr.length-1; int temp=0;
        while(y-x!=1){
            if(arr[x]==1 && arr[x]==arr[y]){
                y--;
            }else if(arr[x]==0 && arr[x]==arr[y]){
                x++;
            }else if((arr[x]==0 && arr[y]==1) || (arr[x]==1 && arr[y]==0)){
                    temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                    x++;y--;
            }
        }

        for(int i =0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }


    public void sortBinaryArrayViaQuickSortPartition(){

    }
}
