package practice.core.java.java8;

interface A{
	void show(String i);
}

/*class Xyz implements A{
	
	public void show(){
		System.out.println("Hello World !!!");
	}
}*/

public class LamdaDemo {

	public static void main(String[] args){
		/*A obj ;
		obj  = new Xyz();
		obj.show();*/
		
		/*A obj = new A(){
			public void show(){
				System.out.println("Hello World !!!");
			}
		};*/
		
		/*A obj = () -> System.out.println("Hello World");*/
		
		/*A obj = (int i) -> System.out.println("Hello World" + i);*/
		
		A obj = i -> System.out.println("Hellow World" + " `- " +i );
		
		obj.show("Gaurov");
	}
}


