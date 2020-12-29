package practice.core.java.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {
    public static void main(String[] args) {
//        List<?> numbers = new ArrayList<Number>();
        List<? extends Number> numbers = new ArrayList<Integer>();
//        List<? super Number> numbers = new ArrayList<Number>();
//        List<Number> numbers = new ArrayList<Number>();

//        numbers.add(new Integer(10));
//        numbers.add(new Float(10));

        Number numbericValue = numbers.get(0);
        System.out.println(numbericValue);

    }
}


class Example<T>{

    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T val){
        T temp = val;
        value = temp ;
    }

    public static <Z> Z noOp(Z val){
        return val;
    }



}
