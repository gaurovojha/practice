package practice.core.gfg.array;

public class MoveNegativeNumbers {
    public static void main(String[] args) {

    }

    static void moveNumbers(int[] arr){
        int j = 0;
        for(int i=0 ;i < arr.length-1; i++){
            if(arr[i]<0){
                //swap with j
                j++;
            }
        }
    }
}
