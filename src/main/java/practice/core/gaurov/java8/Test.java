package practice.core.gaurov.java8;


public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().countElements("abbaaacdddd"));

    }
    public String countElements(String str){
        StringBuilder sb = new StringBuilder();
        char[] charArr  = str.toCharArray();
        int j = 0;
        int count = 1;
        for(int i =1 ; i<str.length();i++){
            if(charArr[j] == charArr[i] && i<str.length()){
                count++;
                continue;
            }
            if(count > 1) {
                sb.append(count);
                sb.append(charArr[j]);
            }else{
                sb.append(charArr[j]);
            }
            j = i;
            count = 1;
        }


        return sb.toString();

    }
}
