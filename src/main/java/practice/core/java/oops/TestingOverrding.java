package practice.core.java.oops;

public class TestingOverrding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup = new Sub();
		sup.add(10, 11);
		//Sub.add1(0, 1);
		
	}

}


class Super{
	 public int add(int i , int j){
		return i+j ;
	}
}

class Sub extends Super{
	
	public short add(int i , int j){
		return 0 ;
	}
}