package practice.core.gaurov.java8;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalEx {


    public static void main(String[] args) {
        //empty optional
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        //of String
        Optional<String> hello  = Optional.of("Hello");
//        Optional<String> hello  = Optional.of(null);
        hello.map(i -> i.concat("World!!") );

        String orElse = hello
                .map(String::toLowerCase)
//                .orElseThrow(IllegalStateException::new);
                .orElseGet(() -> {
                    return "World!!";
                });
//                .orElse("World!!!");
        System.out.println(orElse);


    }
}
