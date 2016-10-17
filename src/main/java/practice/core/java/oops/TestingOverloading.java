package practice.core.java.oops;

public class TestingOverloading {

	public static void main(String ...args) {
		// TODO Auto-generated method stub
		Math m = new Math();
		m.sum(10, 10, 20);

	}

}

class Math {
	
	//int...b is equivalent to int[]
	/*public int sum(int... b) {
		return b[0];
	}

	public void sum(int[] a) {
		return;
	}*/
	
	public int sum(int... b) {
		return b[0];
	}

	public void sum(int[] a) {
		return;
	}
}