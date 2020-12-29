package practice.core.gaurov.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> {
            System.out.println(str);
        };

        consumer.accept("Hello");

        List<String> names = Arrays.asList("Gaurov", "Ojha", "Garima", "Mahima");
        names.stream().forEach(consumer);

    }
}
