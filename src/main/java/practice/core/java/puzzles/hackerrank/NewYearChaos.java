package practice.core.java.puzzles.hackerrank;

public class NewYearChaos {
    public static void main(String[] args) {
        int[] inp = {2, 1, 5, 3, 4}; //1,2,3,4,5
        int[] inp1 = {2, 5, 1, 3, 4};
        int[] inp2 = {1, 2, 5, 3, 7, 8, 6, 4};
        int[] inp3 = {5, 1, 2, 3, 7, 8, 6, 4};
        //1 2 5 3 7 8 6 4
        //
        //1 2 3 4 5 6 7 8
        //1 2 5 3 4 6 7 8
        //1 2 5 3 7 4 6 8
        //1 2 5 3 7 8 4 6
        // 12345678  12534678 12537468 12537846
        minimumBribes(inp1);
    }

    static void minimumBribes(int[] q) {
        int swapCount = 0;
        for(int i = q.length-1 ; i>0 ; i--){
            if(q[i] != i+1){
                if(q[i-1] == i+1){
                    swapCount += 1 ;
                    swap(q, i-1, i );
                }else if(q[i-2] == i+1){
                    swapCount += 2 ;
                    swap(q, i-2, i-1 );
                    swap(q, i-1, i );
                }else{
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swapCount);
    }

    static void swap(int[] q, int i , int j){
        int temp = q[i];
        q[i] = q[j];
        q[j] = temp;
    }

    static void minimumBribes1(int[] q) {
        int chaos = 0;

        for(int i = 0 ; i< q.length ; i++){
            int orgIndex = q[i]-1;
            if(orgIndex-i > 2){
                System.out.print("Too chaotic");
                break;
            }
            System.out.println(i +" ---- "+ q[i] + " **** " +orgIndex);
            if(!(orgIndex == i) && i < orgIndex){
                System.out.println(i +" ---- "+ q[i] + " :::: " +orgIndex);
                chaos += orgIndex-i;
            }else if(i > orgIndex){

            }
            System.out.println(chaos);
        }

    }
}
