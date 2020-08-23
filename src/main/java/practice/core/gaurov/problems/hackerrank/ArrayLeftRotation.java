package practice.core.gaurov.problems.hackerrank;

public class ArrayLeftRotation {


    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int d = 4;
        int[] output = rotLeft(input, d);
        for(int i : output){
            System.out.println(i);
        }
    }


    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] temp = new int[a.length];

        for(int i=0; i<a.length; i++){
            int diff = i-d;
            if(diff<0){
                temp[a.length - Math.abs(diff)] = a[i];
            }else{
                temp[diff]  = a[i];
            }
        }
        return  temp;
    }

}
