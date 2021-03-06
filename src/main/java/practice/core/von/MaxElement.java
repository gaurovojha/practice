package practice.core.von;

public class MaxElement {

    public static void main(String[] args) {
        //find maximun number from all the combinations
        System.out.println(solution(2133));
        int a = '1';
        a++;
        System.out.println(a);

    }

    public static int solution(int N) {
        // write your code in Java SE 8
        // array to store count of digits
        int count[] = new int[10];
        String str = Integer.toString(N);
        // Updating the count array
        for(int i=0; i < str.length(); i++){
            count[str.charAt(i)-'0']++;
        }
        
        int result = 0;
        int multiplier = 1;

        // Loop count array to calculate the maximum
        for (int i = 0; i <= 9; i++)
        {
            while (count[i] > 0)
            {
                result = result + (i * multiplier);
                count[i]--;
                multiplier = multiplier * 10;
            }
        }
        return result;

    }




}