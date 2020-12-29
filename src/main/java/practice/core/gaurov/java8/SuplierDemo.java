package practice.core.gaurov.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SuplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "Hello World!!" ;
        };

        Predicate<String> predicate = (str) -> {
            return str.startsWith("G");
        };

        Function<String, String> concatOjha = (fname) -> {
            String str = fname.join("Ojha");
            return str;
        };

        List<String> names = Arrays.asList("Gaurov", "Garima", "GOT");
        System.out.println(names
                .stream()
                .map(concatOjha)
                .filter(predicate)
                .findFirst()
                .orElseGet(supplier));

    }
}
