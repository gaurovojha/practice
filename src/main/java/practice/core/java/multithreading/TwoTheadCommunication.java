package practice.core.java.multithreading;

public class TwoTheadCommunication {

	public static void main(String[] args) {

		Mutex m = new Mutex();

		Thread t1 = new Thread(new Task1(m), "Thread-1");
		Thread t2 = new Thread(new Task2(m), "Thread-2");

		t1.start();
		t2.start();
	}

}

class Task1 implements Runnable {
	private Mutex m;

	public Task1(Mutex m) {
		this.m = m;
	}

	public void run() {
		while (m.i <= 20) {
			synchronized (m) {
				if (!m.flag) {
					try {
						System.out.println(Thread.currentThread().getName() +":" +m.i);
						m.i++;
						m.flag = true;
						m.notify();
						m.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					continue;
				}
			}
		}
	}
}

class Task2 implements Runnable {
	private Mutex m;

	public Task2(Mutex m) {
		this.m = m;
	}

	public void run() {
		while (m.i <= 20) {
			synchronized (m) {
				if (m.flag) {
					System.out.println(Thread.currentThread().getName() +":" +m.i);
					m.i++;
					m.flag = false;
					m.notify();
					try {
						m.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					continue;
				}
			}
		}
	}
}
