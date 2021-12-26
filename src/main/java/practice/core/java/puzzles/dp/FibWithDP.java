package practice.core.java.puzzles.dp;

public class FibWithDP {

    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(8));
    }


    static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
