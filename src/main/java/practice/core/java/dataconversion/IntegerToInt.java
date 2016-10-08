package practice.core.java.dataconversion;

/**
 * Created by gojha on 3/9/2015.
 */
public class IntegerToInt {
    public static void main(String args[])
    {
        int i=0;
        Integer j=null;
        i=j;
        //will cause a null pointer
        System.out.print(i);
    }
}
