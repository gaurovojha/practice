package practice.core.java.multithreading;

public class Test extends Thread{
	
	public void run(){
		CreatingThreadsMd1 test = new CreatingThreadsMd1();
		test.method2();
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

	public static void main(String args[]) {
		CreatingThreadsMd1 t1 = new CreatingThreadsMd1();
	}

}
