package practice.core.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareObjects {


    public static void main(String[] args) {
        List<Person> personList = createListOfPerson();
        //before sorting
        printPersonList(personList);

        Collections.sort(personList);

        //after sorting
        printPersonList(personList);

    }


    public static void printPersonList(List<Person> personList ){
        System.out.println("**************Priting Person**************");
        personList.forEach((person)-> System.out.println(person.getName()));
    }


    public static List<Person> createListOfPerson(){
        List<Person> personList = new ArrayList<Person>();
        //person1
        Person person1 = new Person();
        person1.setName("Amit");
        person1.setAge("31");

        //person2
        Person person2 = new Person();
        person2.setName("Gaurov");
        person2.setAge("31");

        //person3
        Person person3 = new Person();
        person3.setName("Zeeshan");
        person3.setAge("31");


        personList.add(person3);
        personList.add(person1);
        personList.add(person2);

        return personList;

    }
}
