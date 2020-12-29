package practice.core.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class ListStudentNames {


    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student("gaurov",31)
                , new Student("garima",29)
                , new Student("garima",31)
                , new Student("mahima",25));

        List<String> names = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        names.forEach(System.out::println);


        String commaSeparetedNames = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(","));
        System.out.println(commaSeparetedNames);


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(integers.stream().allMatch(i -> i>0));
        System.out.println(integers.stream().noneMatch(i -> i>0));
        System.out.println(integers.stream().anyMatch(i -> i>0));

        List<Student> myStudents = Arrays.asList(new Student("gaurov",31)
                , new Student("garima",29)
                , new Student("mahima",25));

        DoubleSummaryStatistics doubleSummaryStatistics = myStudents.stream()
                .mapToDouble(Student::getAge)
                .summaryStatistics();
        System.out.println(doubleSummaryStatistics.getMax());


        Map<Boolean, List<Student>> studentMap = myStudents.stream()
                .collect(Collectors.partitioningBy(stud -> stud.getName().equals("gaurov")));

        System.out.println(String.format("students named gaurov %s ", studentMap.get(true)));
        System.out.println(String.format("students not named gaurov %s ", studentMap.get(false)));


        Map<String, Set<Integer>> mappingBy = students.stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.mapping(Student::getAge, Collectors.toSet())));

        //System.out.println(mappingBy);

        Comparator<Student> ageComparator = (user1, user2) -> user1.getAge() - user2.getAge();
        Comparator<Student> ageComparator1 = (user1, user2) -> Integer.compare(user1.getAge(), user2.getAge());
        Comparator<Student> ageComparator2 = Comparator.comparing(Student::getAge);
        students.sort(ageComparator2);
    }
}

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
