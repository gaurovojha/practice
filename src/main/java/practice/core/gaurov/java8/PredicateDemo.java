package practice.core.gaurov.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Consumer<String> consumer = (str) -> {
            System.out.println(str);
        };

        Predicate<String> predicate = (str) -> {
            return !str.equals("Ojha");
        };

        List<String> names = Arrays.asList("Gaurov", "Ojha", "Garima", "Mahima");
        names.stream().filter(predicate).forEach(consumer);
    }
}
