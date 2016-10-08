package practice.core.java.multithreading;

import java.util.ArrayList;
import java.util.List;

public class WaitAndNotify {

	public static void main(String[] args) throws InterruptedException {
		/*PrintMessage print = new PrintMessage();
		Thread t1 = new Thread(print);
		t1.setName("thread-1");
		Thread t2 = new Thread(print);
		t2.setName("thread-2");
		t1.start();
		t2.start();*/
		int T = 3;
		int sum=0;
		String[] strArr = "6846 9940 4037 4956 7765 9128 1251 2694 5084 6799 3007 367 2383 6170 8410 3844 4028 1330 6055 5226 6566 4095 7492 5381 2641 9793".split(" ");
		List<Integer> listCk = new ArrayList<Integer>();
		for(String s : strArr){
			listCk.add(Integer.parseInt(s));
		}
		int q = (T*12)/26;
		int r = (T*12)%26;
		
		sum = q*findSum(listCk);
		for(int i=0;i<r;i++){
			sum = sum + listCk.get(i);
		}
		System.out.println(sum);
	}
	public static int findSum(List<Integer> listCk){
    	int sum = 0;
    	for(Integer i : listCk){
				sum = sum + i;
			}
			return sum;
    }
}

class PrintMessage implements Runnable {

	boolean isLocked = true;
	int i = 0;

	public void run() {
		while (i < 20) {
			synchronized (this) {
				/*
				 * System.out.println("Locked by" +
				 * Thread.currentThread().getName());
				 * System.out.println("value of i" + i);
				 * System.out.println("islocked" + isLocked);
				 */
				if (isLocked) {
					System.out.println("Locked by" + Thread.currentThread().getName() + "A");
					System.out.println(":::::::::::::::::::");
					// System.out.println("A");
					isLocked = false;
					i++;
					try {
						Thread.sleep(2000);
						wait();
						notify();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("Locked by" + Thread.currentThread().getName() + "B");
					System.out.println(":::::::::::::::::::");
					isLocked = true;
					i++;
					notify();
					try {
						Thread.sleep(2000);
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}