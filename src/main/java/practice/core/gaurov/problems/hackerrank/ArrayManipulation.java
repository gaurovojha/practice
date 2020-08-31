package practice.core.gaurov.problems.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayManipulation {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        int max=-1;
        int[] tempArr = new int[n];
        for(int j=0; j<queries.length; j++){
            int a = queries[j][0]-1;
            int b = queries[j][1]-1;
            int c = queries[j][2];
            for(int i=a;i<=b;i++){
                tempArr[i]+=c;
                if(tempArr[i]>max)
                    max=tempArr[i];
            }
        }
        return max;
    }
}
