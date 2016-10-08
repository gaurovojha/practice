package practice.core.java.cloning;

public class CloningTest {
	
	public static void main(String args[]){
		Rectangle rec = new Rectangle();
		rec.setHeight(10);
		rec.setLength(11);
		rec.setWidth(5);
		
		try {
			Rectangle rec1 = rec.clone();
			System.out.println(rec1.getHeight());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
