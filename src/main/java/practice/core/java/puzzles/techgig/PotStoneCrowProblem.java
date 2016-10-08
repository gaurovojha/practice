package practice.core.java.puzzles.techgig;

import practice.core.java.utils.PrintingUtility;
import practice.core.java.utils.SortingUtility;

/**
 * Created by gojha on 5/2/2015.
 */
public class PotStoneCrowProblem
{
    static int[] input={3,5,5,5,5,5,5,5} ;
    static int N , K=1;
    public static void main(String args[])
    {
        thirstyCrowProblem(input,N, K);
    }
    private static  void thirstyCrowProblem(int[] input , int N ,int K)
    {
        //sort the input array
        PrintingUtility.printIntArray(SortingUtility.sortIntArray(input));
        System.out.println(countStonesApproach1(input,N,K));
    }

    private static int countStonesApproach2(int[] inputm,int N,int K)
    {
        int noOfStones=0;

        return noOfStones;
    }

    private static int countStonesApproach1(int[] inputm,int N,int K)
    {
        int[] tempArr={1,2,3,4,5,6,7,8,9};

        int noOfPots=0,noOfStones=0;


        for(int i=0;i<input.length;i++)
        {
            tempArr[i]=0;
        }
        PrintingUtility.printIntArray(tempArr);

        while (noOfPots!=K)
        {
            for(int i=0;i<input.length;i++)
            {
                tempArr[i]++;
                noOfStones = noOfStones + 1 -  noOfPots;
            }
            for(int i=0;i<input.length;i++)
            {
                if(input[i]==tempArr[i])
                {
                    noOfPots++;
                }
            }
            PrintingUtility.printIntArray(tempArr);
            PrintingUtility.printIntArray(input);
        }
        return noOfStones;
    }
}
