package practice.core.java.multithreading;

/**
 * Created by gojha on 3/15/2015.
 */
public class CreatingThreadMd2 implements Runnable
{
    public static void main(String args[])
    {
        CreatingThreadMd2 ct2 = new CreatingThreadMd2();
        Thread t = new Thread(ct2,"MyThread");
        t.start();
        System.out.println(t.getName());
    }

	public void run() {
		CreatingThreadsMd1 test = new CreatingThreadsMd1();
		test.method2();
		 System.out.println("Creating Thread by implementing java.lang.Runnable interface : Mythread is running ");
		
	}

    
}
