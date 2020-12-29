package practice.core.gaurov.problems.hackerrank.strings;

public class SpecialStringAgain {

    public static void main(String[] args) {
        specialString("test");
    }



    // Complete the substrCount function below.
    static long substrCount(int n, String s) {

    return 0l;
    }

    static String specialString(String s) {
        char[] charArr = s.toCharArray();
        int len =s.length();
        int x=0,y=len-1;

        for(int i=0,j=len-1;i<len-1;i++){
            if(i-j==0 && charArr[i]==charArr[j]){

            }
            if(charArr[i]==charArr[j]){
                j--;
            }

        }
        System.out.println(x +":"+y);

    return null;
    }

}
