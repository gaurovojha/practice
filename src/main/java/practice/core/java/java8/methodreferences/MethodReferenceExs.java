package practice.core.java.java8.methodreferences;

import practice.core.java.java8.PersonUtil;

public class MethodReferenceExs {


    public static void main(String[] args) {


        boolean isAdult = PersonUtil.createListOfPerson().stream().anyMatch(PersonUtil::isAdult);
        System.out.println(isAdult);
    }
}
