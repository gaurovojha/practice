package practice.core.java.puzzles;

/**
 * Created by gojha on 3/22/2015.
 */
public class MyntraPuzzle
{
    static String input="GLLL";
    public static void main(String args[])
    {
        System.out.print(findSolution(input));

    }

    public static String findSolution(String inputText)
    {
        int i=0;
        int sum=0;
        while(i<inputText.length()-1)
        {
            String str = Character.toString(inputText.charAt(i)) + Character.toString(inputText.charAt(i+1));
            sum=mainLogic(str,sum);
            i++;
        }
        if(sum==0)
        {
            return "YES";
        }
        else
        {
            System.out.print(sum);
            return "NO";
        }
    }

    public static int mainLogic(String input, int sum)
    {
        if(input.equalsIgnoreCase("GL")||input.equalsIgnoreCase("LG"))
        {
            sum=sum+1;
        }
        else if(input.equalsIgnoreCase("GR")||input.equalsIgnoreCase("RG"))
        {
            sum=sum+1;
        }
        else if(input.equalsIgnoreCase("LR")||input.equalsIgnoreCase("RL"))
        {
            sum=sum+1;
        }
        else if(input.equalsIgnoreCase("GG"))
        {
            sum=sum-1;
        }
        else if(input.equalsIgnoreCase("LL"))
        {
            sum=sum-1;
        }
        else if(input.equalsIgnoreCase("RR"))
        {
            sum=sum-1;
        }
        return sum;
    }

}
