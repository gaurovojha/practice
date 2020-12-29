package practice.core.gaurov.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {

    public static void main(String[] args) {
        List<List<Integer>> listofList = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9));

        List<Integer> list = listofList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        list.forEach(System.out::print);

        List<List<User>> users = Arrays.asList(Arrays.asList(new User(Arrays.asList(new Address(Arrays.asList(new Item("First Item")))))));
        List<User> collect = users.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}


class User {

    List<Address> addresses;

    public User(List<Address> addresses) {
        this.addresses = addresses;
    }
}
class Address {
    List<Item> items;

    public Address(List<Item> items) {
        this.items = items;
    }
}
class Item{
    String item;

    public Item(String item) {
        this.item = item;
    }
}