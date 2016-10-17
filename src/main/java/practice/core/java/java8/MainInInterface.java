package practice.core.java.java8;

public interface MainInInterface {

	public static void main(String[] args) {
		System.out.println("Main inside Interface is allowed!!!!");

	}

	default void message() {
		System.out.println("SENT");
	}

	static void message1() {
		System.out.println("SENT");
	}

	static void message2() {
		System.out.println("SENT");
	}
	
	default void message3() {
		System.out.println("SENT");
	}
}
