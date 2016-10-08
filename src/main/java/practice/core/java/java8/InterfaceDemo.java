package practice.core.java.java8;

interface Phone {
	void call();

	/*
	 * newly added method void message(); Now you have to implement it in each
	 * class that implements PHONE interface IN JAVA 8
	 */
	default void message() {
		System.out.println("SENT");
	}

}

class AndroidPhone implements Phone {

	public void call() {
		System.out.println("CALLING");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Phone ph = new AndroidPhone();
		ph.call();
		ph.message();
	}

}
