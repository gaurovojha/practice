package practice.core.java.classloader;
/*
 * Classloder principles :
 * 	DELEGATION
 * 	VISIBLITY
 * 	UNIQUENESS
 */
public class BasicClassLoaderEx {

	public static void main(String[] args) {
		System.out.println("ClassLoader of class : BasicClassLoaderEx" + BasicClassLoaderEx.class.getClassLoader());

		System.out.println(
				"ClassLoader of class : BasicClassLoaderEx" + BasicClassLoaderEx.class.getClassLoader().getParent());

		try {
			Class.forName("BasicClassLoaderEx", true, BasicClassLoaderEx.class.getClassLoader().getParent());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}

}
