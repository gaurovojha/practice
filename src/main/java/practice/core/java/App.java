package practice.core.java;

import practice.core.java.strings.StringManipulation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //String maipulation
        StringManipulation stringManipulation = new StringManipulation();
        System.out.println(stringManipulation.reverseString("gaurovojha"));
        System.out.println(stringManipulation.reverseWithStringBuffer("gaurovojha"));
    }
}
