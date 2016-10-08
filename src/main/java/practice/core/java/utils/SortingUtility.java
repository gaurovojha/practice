package practice.core.java.utils;

/**
 * Created by gojha on 5/2/2015.
 */
public class SortingUtility
{
    public static int[] sortIntArray(int[] input)
    {
        int[] output={};
        for(int i=0;i<input.length;i++)
        {
            for(int j=i+1;j<input.length;j++)
            {
                //sorting in increasing/acsending order to sort in descending order input[i]<input[j]
                if(input[i]>input[j])
                {
                    input[j]=input[i]+input[j];
                    input[i]=input[j]-input[i];
                    input[j]=input[j]-input[i];
                }
            }

        }
        return input;
    }
}
