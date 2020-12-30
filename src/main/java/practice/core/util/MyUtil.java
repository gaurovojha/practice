package practice.core.util;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class MyUtil {

    public static void swap(int[] q, int i , int j){
        int temp = q[i];
        q[i] = q[j];
        q[j] = temp;
    }

    public static void printArr(int[] arr){
        Arrays.stream(arr).forEach(System.out::println);
    }
}
