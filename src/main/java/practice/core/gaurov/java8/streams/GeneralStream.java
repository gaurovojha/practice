package practice.core.gaurov.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class GeneralStream {

    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.empty();
        Stream.of("gaurov", "garima", "akash", "ahana", "mahima")
                .filter( name -> name.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);


        Collection<Integer> collection = Arrays.asList(1, 2, 4, 5, 6, 7);
        Stream<Integer> stringStream = collection.stream();

        System.out.println(1.0%2);
    }
}