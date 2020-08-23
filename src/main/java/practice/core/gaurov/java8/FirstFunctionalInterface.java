package practice.core.gaurov.java8;

public interface FirstFunctionalInterface {

    /**
     * An abstract fucntion inside an interface
     */
    void firstAbstractMethod(String s);

    /**
     * Non abstract default function inside an interface
     */
    default void firstDefaultMethod(){
        System.out.println("my implementation is inside an Interface!!");
    }

}


class test{

    public static void main(String[] args) {

        // Anonymous Class : THIS IS AN OLD WAY

        FirstFunctionalInterface functionalInterface = new FirstFunctionalInterface() {
            @Override
            public void firstAbstractMethod(String s) {
                System.out.println(s);
            }
        };
        functionalInterface.firstAbstractMethod("I an implementation of FirstFunctionalInterface");


        // Lambda Expression : THIS IS AN OLD WAY

        FirstFunctionalInterface lambda = (s) -> System.out.println(s) ;
        FirstFunctionalInterface lambda2 = System.out::println ;
        lambda.firstAbstractMethod("LAMBDA EXPRESSION implementation of FirstFunctionalInterface");
        lambda2.firstAbstractMethod("Shoter LAMBDA EXPRESSION implementation of FirstFunctionalInterface");
    }
}