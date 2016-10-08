package practice.core.java.multithreading;

/**
 * Created by gojha on 3/15/2015.
 */
public class ThreadAnonymousClass
{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            new Thread(""+i)
            {
                public void run()
                {
                    System.out.println("Thread :" +getName() + " running");
                }
            }.start();
        }
    }
}
