package practice.core.java.datesandtime;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

/**
 * Created by gojha on 5/1/2015.
 */
public class XmlGregorianCal
{
    private XMLGregorianCalendar startDate = new XMLGregorianCalendarImpl(new GregorianCalendar(24,10,10));
    public static void main(String args[])
    {
        XMLGregorianCalendar xmlGregorianCalendar = new XMLGregorianCalendarImpl();
        //UpmDateUtils dateUtils = new
        System.out.println(xmlGregorianCalendar.toString());
    }
}
