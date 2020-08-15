package practice.core.java;

import java.util.Random;
import java.util.UUID;

public class Test {

    public static void main(String[] args) {
        int arr[][] = {
                {1 ,1 ,1 ,0 ,0 ,0},
                {0 ,1 ,0 ,0 ,0 ,0},
                {1 ,1 ,1 ,0 ,0 ,0},
                {0 ,0 ,2 ,4 ,4 ,0},
                {0 ,0 ,0 ,2 ,0 ,0},
                {0 ,0 ,1 ,2 ,4 ,0}

        };

    }


    static int hourglassSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int sum = -999999;
        for(int i =0 ; i < rows-2 ; i++){
            for(int j = 0 ; j < cols-2 ; j++){

                int hourGlassTotal = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        +arr[i+1][j+1]+
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] ;
                if(hourGlassTotal > sum)
                    sum = hourGlassTotal;
            }

        }
        return sum;


    }
}
