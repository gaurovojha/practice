package practice.core.java.multithreading;

/**
 * Created by gojha on 3/15/2015.
 */
public class CreatingThreadsMd1 extends Thread
{
    public static void main(String args[])
    {
        CreatingThreadsMd1 creatingThreadsMd1 = new CreatingThreadsMd1();
        creatingThreadsMd1.setName("MyThread1");
        creatingThreadsMd1.start();
        System.out.println(creatingThreadsMd1.getName());
        
        
        Test t2 = new Test();
        t2.setName("MyThread2");
        System.out.println(creatingThreadsMd1.getName());
        t2.start();
    }
    public void run()
    {
        System.out.println("Creating Thread by extending java.lang.Thread  : MyThread is running");
        method1();
    }
    
    public synchronized void method1() {
		System.out.println("inside method one");
	}

	public synchronized void method2() {
		System.out.println("inside method two");
	}

	public static synchronized void method3() {
		System.out.println("inside method two");
	}
}
