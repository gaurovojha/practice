package practice.core.java.puzzles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gojha on 3/4/2015.
 */
public class FindMaxSlice
{
    static int maxSlice,sum;
    static List<Integer> sliceList = new ArrayList<Integer>();
    static boolean flag;
    static int[] arr={200,2,4,-5,8,100,1999,2,-100};
    public static void main(String args[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(sum<sum+arr[i])
            {
                sum=sum+arr[i];
            }
            else
            {
                if(maxSlice<sum)
                {
                    flag=true;
                    maxSlice=sum;
                    sum=0;
                }
                continue;
            }
        }
        if(!flag || maxSlice<sum)
        {
            maxSlice=sum;
        }
        System.out.print("value of max slice is" + maxSlice);
    }


}
