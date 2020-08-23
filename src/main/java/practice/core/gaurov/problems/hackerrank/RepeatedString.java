package practice.core.gaurov.problems.hackerrank;

import java.util.Scanner;
import java.util.stream.IntStream;

public class RepeatedString {

    public static void main(String[] args) {
        String input = "aba";
        String input1 = "cfimaakj";
        System.out.println(554045874191l%8);
        System.out.println(2*554045874191l/8);
        System.out.println("138511468548");
        //System.out.println(repeatedString(input1, 554045874191l));
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = "cfimaakj";
//        long n = 554045874191l;
//        long count =0;
//        for(char c : s.toCharArray())
//            if(c == 'a')
//                count++;
//
//        long factor = (n/s.length());
//        long rem = (n%s.length());
//        count =  factor*count  ;
//        for(int i=0;i<rem;i++)
//            if(s.charAt(i)=='a')
//                count++;
//        System.out.println(count);
//
//
//
//    }


    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int l = s.length();

        long tmpCount = 0l;
        //1. find a count in s
        for(char c : s.toCharArray()){
            if('a'==c){
                tmpCount++;
            }
        }
        int remainder = (int) (n%l);
        if(remainder!=0){
            //2. find a count in n length string
            tmpCount = tmpCount * (n/l) ;

            //3. find a count in the remaining string
            for(char c  : s.substring(0,remainder).toCharArray()){
                if('a'==c){
                    tmpCount++;
                }
            }
        }else{
            tmpCount = tmpCount * n/l ;
        }
    return tmpCount;
    }
}
