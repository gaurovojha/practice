package practice.core.java.puzzles.techgig;

public class GcdMultipleSum
{
    public static void main(String args[])
    {
        //Write code here
        int[] input1={1,0},output;
        int gcd = findGCD(input1[0],input1[1]);
        output=findSolution(gcd,input1[0],input1[1]);
        System.out.println("{"+output[0] +"," + output[1]+"}");
    }
    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
    private static int[] findSolution(int gcd , int a , int b)
    {
        int[] output={0,0};
        if(a<0 || b<0)
        {
            return output;
        }
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                if(gcd==(a*i+b*j))
                {
//                    System.out.println("{"+i+","+j+"}");
                    output[0]=i;
                    output[1]=j;
                    break;
                }
                else if(gcd==(a*j+b*i))
                {
                    //System.out.println("{"+i+","+j+"}");
                    output[0]=j;
                    output[1]=i;
                    return output;
                }
                else if(gcd==(a*i+b*(-j)))
                {
//                    System.out.println("{"+i+","+"-"+j+"}");
                    output[0]=i;
                    output[1]=-j;
                    return output;
                }
                else if(gcd==(a*(-i)+b*j))
                {
//                    System.out.println("{"+"-"+i+","+j+"}");
                    output[0]=-i;
                    output[1]=j;
                    return output;
                }
                else if(gcd==(a*(-j)+b*i))
                {
//                    System.out.println("{"+"-"+i+","+j+"}");
                    output[0]=-j;
                    output[1]=i;
                    return output;
                }
                else if(gcd==(a*(j)+b*-i))
                {
//                    System.out.println("{"+"-"+i+","+j+"}");
                    output[0]=j;
                    output[1]=-1;
                    return output;
                }
            }
        }
        return output;
    }
}
