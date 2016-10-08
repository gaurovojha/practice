package practice.core.java.misc;

public class MethodResolutionEx {

	public static void main(String[] args) {
		
		//add(null);
		add(new Integer(0));
		add("Gaurov");
	}
	
	public static void add(Object obj){
		System.out.println("inside object parameter add" +obj);
	}
	
	public static void add(String str){
		System.out.println("inside String parameter add" + str);
	}
	
	public static void add(Integer integer){
		System.out.println("inside Integer parameter add" + integer);
	}
	
	public static void add(int t){
		System.out.println("inside int parameter add" + t);
	}

}
