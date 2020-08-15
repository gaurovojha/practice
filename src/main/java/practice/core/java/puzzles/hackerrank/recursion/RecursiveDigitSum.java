package practice.core.java.puzzles.hackerrank.recursion;

import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class RecursiveDigitSum {

    public static void main(String[] args) {
        String str= "148";
        int k=3;
        int sum = digitSum(str) * k;
        System.out.println(digitSum(String.valueOf(sum)));
        //System.out.println(str.substring(3));
        //System.out.println(str.substring(0,3));
    }

    static int superDigitSum(String n, int k) {
        //System.out.println(String.format("n : %s *** k: %s",n , k));
        if(k==0)
            return 0;
        String res = String.valueOf(Integer.parseInt(n.substring(k-1)) + superDigitSum(n.substring(0,k-1),k-1));
        return res.length()> 1 ? superDigitSum(res, res.length()) : Integer.parseInt(res);
    }

    static int superDigitSum1(String n, int k) {
        //System.out.println(String.format("n : %s *** k: %s",n , k));
        int res = 0;
        for(int i=k-1;i>=0;i--){
            res+=Integer.parseInt(n.substring(i));
            n = n.substring(0,i);
        }
        String str = String.valueOf(res);
        return str.length()> 1 ? superDigitSum1(str, str.length()) : res;
    }


    static int superDigitSum2(String n, int k) {
        //System.out.println(String.format("n : %s *** k: %s",n , k));
        if(k==0)
            return 0;
        return  Integer.parseInt(n.substring(k-1)) + superDigitSum2(n.substring(0,k-1),k-1);
    }


    static int digitSum(String n){
        String str = String.valueOf(String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum());
        return str.length()>1 ? digitSum(str)
                : Integer.parseInt(str);
    }
}
