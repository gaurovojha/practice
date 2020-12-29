package practice.core.gaurov.problems.dp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FibonacciNumbers {

    private final int MAX = 100;
    private final int NIL = -1;

    int[] lookUp = new int[MAX];

    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        fibonacciNumbers.init();
        System.out.println(fibonacciNumbers.fibonacci(7));

    }

    private void init(){
        for(int i=0 ; i< lookUp.length; i++){
            lookUp[i] = NIL;
        }
    }

    private int fibonacci(int n){
        if(lookUp[n] == NIL){
            if(n<2) return n;
            lookUp[n] = fibonacci(n-1) + fibonacci(n-2);
        }else return lookUp[n];
        return lookUp[n];
    }
}
