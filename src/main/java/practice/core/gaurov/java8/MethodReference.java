package practice.core.gaurov.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    Integer[] ints = {1,2,4,5,6,7};
    List<Integer> numbers = Arrays.asList(ints);

    Adder adder = new Adder();

    public void printNumbers(){
        List<Integer> newList = numbers.stream()
                .map(adder::addX)
                .filter(i -> i%2> 0)
                .map(adder::addY)
                .collect(Collectors.toList());
        newList.forEach(System.out::println);

    }

    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();
        methodReference.printNumbers();
    }
}



class Adder {

    int X = 100;
    int Y = 100;

    public int addX(int i){
        return i + X;
    }

    public int addY(int i){
        return i + Y;
    }

}