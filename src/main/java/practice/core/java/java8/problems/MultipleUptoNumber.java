package practice.core.java.java8.problems;

public class MultipleUptoNumber {
    public static void main(String[] args) {
        findMultipleUptoNumber(100,3,5);

    }


    //solution1
    public static void findMultipleUptoNumber(int number, int num1, int num2){
        int sum=0;
        for(int i=1;i<number;i++){
            if(i%num1==0 || i%num2==0){
                System.out.println(i);;
            }
        }
    }

    //solution2
    public static void findMultipleUptoNumberMethod2(int number, int num1, int num2){
        int sum=0;
        for(int i=1;i<number;i++){
            if(i%num1==0 || i%num2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
