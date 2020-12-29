package practice.core.gaurov.java8.streams;

import java.util.stream.IntStream;

public class IntStreamEx {

    public static void main(String[] args) {
//        printIntegers();
//        skipStream();

        System.out.println(IntStream.rangeClosed(1,10)
                .skip(5)
                .sum());



    }


    private static void skipStream(){
        IntStream.rangeClosed(1,10)
                .skip(5)
                .forEach(System.out::println);
    }

    private static void printIntegers(){
        System.out.println("Integer stream of one element");
        IntStream.of(4).forEach(System.out::println);
        System.out.println("Integer stream of few elements");
        IntStream.of(1,2,3,4,5).forEach(System.out::println);
        System.out.println("Integer stream of range");
        IntStream.range(0,1).forEach(System.out::println);
        System.out.println("Integer stream of rangeclosed");
        IntStream.rangeClosed(0,1).forEach(System.out::println);
    }
}
