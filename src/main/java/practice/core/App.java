package practice.core;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Method;
import java.nio.channels.ServerSocketChannel;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

class test implements I1{

    public void abc() {
        System.out.println("super");
    }


}

public class App extends test{

    public static void main(String[] args) throws IOException {
//        Console c = System.console();
        System.out.println();

        Supplier<String> s = () -> "CAR";
        Consumer<String> c = (s1) -> System.out.print(s1.toLowerCase());
        Consumer<String> d = (s2) -> System.out.print(s2.toUpperCase());

        c.andThen(d).accept(s.get());

//        bufferedReader.strea().forEach(System.out::println);
//        System.out.println(bufferedReader.lines());



    }

    void test1(){

    }

    public App() {


//        count++;

    }
}


interface I1{
    String s1= "N1";
    String s2= "S1";
}
interface I2 extends I1{
    String s1= "N2";
}




enum EL {

    HELIUM("HE","Gas");

    EL(String s , String s1) {
    }

    String s1;
    String s2;

    public String ch(){return s1;}
    public String ch1(){return s2;}

}