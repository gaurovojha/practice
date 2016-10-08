package practice.core.java.oops;

/**
 * Created by gojha on 4/11/2015.
 */
public class PolymorphismOverRidding
{
    public static void main(String args[])
    {
        Animal a = new Dog();
        Dog d = new Dog();
        //complier check the method definition in the refrence class
        //a.eat();
        d.eat();
    }
}

class Animal
{
    public void eat() throws Exception
    {
        System.out.print("this is a eat method of ANIMAL class");
    }
}

class Dog extends Animal
{
    public void eat()
    {
        System.out.print("this is a eat method of DOG class");
    }

}
