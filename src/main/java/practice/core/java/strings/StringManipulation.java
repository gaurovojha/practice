package practice.core.java.strings;

/**
 * Created by gojha on 3/3/2015.
 */
public class StringManipulation {

    private String reversedString="";

    public String reverseString(String inString)
    {
        for(int i=inString.length()-1;i>=0;i--)
        {
            reversedString=reversedString+inString.charAt(i);
        }
        return reversedString;
    }

    public String reverseWithStringBuffer(String inString)
    {
        StringBuffer sb = new StringBuffer(inString);
        sb.reverse();
        return sb.toString();
    }
}

