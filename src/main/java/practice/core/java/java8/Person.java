package practice.core.java.java8;

public class Person implements Comparable<Person> {

    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
