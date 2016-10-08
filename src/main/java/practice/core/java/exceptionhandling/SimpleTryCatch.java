package practice.core.java.exceptionhandling;

/**
 * Created by gojha on 3/27/2015.
 */
public class SimpleTryCatch
{
    public static void main(String args[])
    {
        try
        {
            SimpleTryCatch simpleTryCatch = new SimpleTryCatch();
            simpleTryCatch.divideTwoNo(1,0);
            System.out.println("after exception in try block");
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
        System.out.print("statement after catch");

    }

    public void iThrowException()
    {
        divideTwoNo(1,0);
    }

    public int divideTwoNo(int a , int b)
    {
        return a/b;
    }
}
