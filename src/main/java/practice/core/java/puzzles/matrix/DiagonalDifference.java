package practice.core.java.puzzles.matrix;

import java.util.List;
import java.util.stream.IntStream;

public class DiagonalDifference {

    public static void main(String[] args) {

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int row  = arr.size();
        int diagonal1=0,diagonal2=0;
        int a=0,b=0,c=0;
        int d = arr.get(0).size()-1;
        for(int i = 0 ; i< row ; i++){
            diagonal1 += arr.get(a).get(b);
            a++;b++;

            diagonal2 += arr.get(c).get(d);
            c++;d--;
        }
        return Math.abs(diagonal1-diagonal2);
    }

    public static int diagonalDifferenceWithLambda(List<List<Integer>> arr) {
        // Write your code here

        int row  = arr.size();
        int diagonal1=0,diagonal2=0;
        int a=0,b=0,c=0;
        int d = arr.get(0).size()-1;

        for(int i = 0 ; i< row ; i++){
            diagonal1 += arr.get(a).get(b);
            a++;b++;

            diagonal2 += arr.get(c).get(d);
            c++;d--;
        }
        return Math.abs(diagonal1-diagonal2);
    }
}
