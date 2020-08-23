package practice.core.gaurov.problems.hackerrank;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnTheClouds {

    public static void main(String[] args) {
        int[] input1 = {0,0,1,0,0,1,0};
        int[] input2 = {0,0,1,0,0,1,0};
        int[] input3 = {0,0,0,1,0,0};
        System.out.println(jumpingOnClouds(input3));
    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumpCount = 0;
        int i=0 ;
        while(i < c.length-1){
            if(i+2 < c.length && c[i+2]==0){
                i = i+2;
                jumpCount++;
                continue;
            }
            i++;
            jumpCount++;
        }
        return jumpCount;
    }

}
