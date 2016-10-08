package practice.core.java.puzzles.techgig;

/**
 * Created by gojha on 5/2/2015.
 */
public class SumOfMatchSticks
{
    public static void main(String args[])
    {
        int[] input = {1,2,3,4,5};
        System.out.println(match_sticks(input,5,3));
    }
    public static int match_sticks(int[] input1, int input2, int input3) {
        int sumArray []= new int[2000];
        int N = input1.length;
        if (input3 > N) {
            return -1;
        }
        int combination[] = new int[input3];
        int r = 0;
        int index = 0;
        int i=0;
        while (r >= 0) {
            if (index <= (N + (r - input3))) {
                combination[r] = index;
                if (r == input3 - 1) {
                    int sum=0;
                    for(int l=0;l<combination.length;l++){
                        sum=sum+input1[combination[l]];

                    }
                    if(sum%input2==0){
                        sumArray[i]=sum;
                        i++;
                    }

                    index++;
                } else {
                    index = combination[r] + 1;
                    r++;
                }
            } else {
                r--;
                if (r > 0)
                    index = combination[r] + 1;
                else
                    index = combination[0] + 1;
            }

        }



        int finalSum=sumArray[0];
        if(finalSum==0){
            finalSum=-1;
        }else{
            for(int j=1;j<sumArray.length;j++){
                if(sumArray[j]==0){
                    break;
                }
                if(finalSum>sumArray[j]){
                    finalSum=sumArray[j];
                }
            }
        }
        return finalSum;
    }
}
